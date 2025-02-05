package edu.uci.ics.amber.engine.architecture.worker.promisehandlers

import edu.uci.ics.amber.engine.architecture.worker.{PauseType, WorkerAsyncRPCHandlerInitializer}
import edu.uci.ics.amber.engine.architecture.worker.promisehandlers.PauseHandler.PauseWorker
import edu.uci.ics.amber.engine.architecture.worker.statistics.WorkerState
import edu.uci.ics.amber.engine.architecture.worker.statistics.WorkerState.{PAUSED, READY, RUNNING}
import edu.uci.ics.amber.engine.common.rpc.AsyncRPCServer.ControlCommand

object PauseHandler {

  final case class PauseWorker() extends ControlCommand[WorkerState]
}

trait PauseHandler {
  this: WorkerAsyncRPCHandlerInitializer =>

  registerHandler { (pause: PauseWorker, sender) =>
    if (stateManager.confirmState(RUNNING, READY)) {
      pauseManager.recordRequest(PauseType.UserPause, true)
      dataProcessor.disableDataQueue()
      stateManager.transitTo(PAUSED)
    }
    stateManager.getCurrentState
  }
}
