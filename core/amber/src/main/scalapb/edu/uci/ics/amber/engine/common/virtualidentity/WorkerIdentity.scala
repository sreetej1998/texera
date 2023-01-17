// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package edu.uci.ics.amber.engine.common.virtualidentity

@SerialVersionUID(0L)
final case class WorkerIdentity(
    operator: edu.uci.ics.amber.engine.common.virtualidentity.LayerIdentity,
    actor: edu.uci.ics.amber.engine.common.virtualidentity.ActorVirtualIdentity
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[WorkerIdentity] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = operator
        if (__value != edu.uci.ics.amber.engine.common.virtualidentity.LayerIdentity.defaultInstance) {
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
        }
      };
      
      {
        val __value = actor
        if (__value != edu.uci.ics.amber.engine.common.virtualidentity.ActorVirtualIdentity.defaultInstance) {
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
        }
      };
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = operator
        if (__v != edu.uci.ics.amber.engine.common.virtualidentity.LayerIdentity.defaultInstance) {
          _output__.writeTag(1, 2)
          _output__.writeUInt32NoTag(__v.serializedSize)
          __v.writeTo(_output__)
        }
      };
      {
        val __v = actor
        if (__v != edu.uci.ics.amber.engine.common.virtualidentity.ActorVirtualIdentity.defaultInstance) {
          _output__.writeTag(2, 2)
          _output__.writeUInt32NoTag(__v.serializedSize)
          __v.writeTo(_output__)
        }
      };
    }
    def withOperator(__v: edu.uci.ics.amber.engine.common.virtualidentity.LayerIdentity): WorkerIdentity = copy(operator = __v)
    def withActor(__v: edu.uci.ics.amber.engine.common.virtualidentity.ActorVirtualIdentity): WorkerIdentity = copy(actor = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = operator
          if (__t != edu.uci.ics.amber.engine.common.virtualidentity.LayerIdentity.defaultInstance) __t else null
        }
        case 2 => {
          val __t = actor
          if (__t != edu.uci.ics.amber.engine.common.virtualidentity.ActorVirtualIdentity.defaultInstance) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => operator.toPMessage
        case 2 => actor.toPMessage
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToSingleLineUnicodeString(this)
    def companion = edu.uci.ics.amber.engine.common.virtualidentity.WorkerIdentity
    // @@protoc_insertion_point(GeneratedMessage[edu.uci.ics.amber.engine.common.WorkerIdentity])
}

object WorkerIdentity extends scalapb.GeneratedMessageCompanion[edu.uci.ics.amber.engine.common.virtualidentity.WorkerIdentity] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[edu.uci.ics.amber.engine.common.virtualidentity.WorkerIdentity] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): edu.uci.ics.amber.engine.common.virtualidentity.WorkerIdentity = {
    var __operator: _root_.scala.Option[edu.uci.ics.amber.engine.common.virtualidentity.LayerIdentity] = _root_.scala.None
    var __actor: _root_.scala.Option[edu.uci.ics.amber.engine.common.virtualidentity.ActorVirtualIdentity] = _root_.scala.None
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __operator = _root_.scala.Some(__operator.fold(_root_.scalapb.LiteParser.readMessage[edu.uci.ics.amber.engine.common.virtualidentity.LayerIdentity](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 18 =>
          __actor = _root_.scala.Some(__actor.fold(_root_.scalapb.LiteParser.readMessage[edu.uci.ics.amber.engine.common.virtualidentity.ActorVirtualIdentity](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case tag => _input__.skipField(tag)
      }
    }
    edu.uci.ics.amber.engine.common.virtualidentity.WorkerIdentity(
        operator = __operator.getOrElse(edu.uci.ics.amber.engine.common.virtualidentity.LayerIdentity.defaultInstance),
        actor = __actor.getOrElse(edu.uci.ics.amber.engine.common.virtualidentity.ActorVirtualIdentity.defaultInstance)
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[edu.uci.ics.amber.engine.common.virtualidentity.WorkerIdentity] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      edu.uci.ics.amber.engine.common.virtualidentity.WorkerIdentity(
        operator = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[edu.uci.ics.amber.engine.common.virtualidentity.LayerIdentity]).getOrElse(edu.uci.ics.amber.engine.common.virtualidentity.LayerIdentity.defaultInstance),
        actor = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[edu.uci.ics.amber.engine.common.virtualidentity.ActorVirtualIdentity]).getOrElse(edu.uci.ics.amber.engine.common.virtualidentity.ActorVirtualIdentity.defaultInstance)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = VirtualidentityProto.javaDescriptor.getMessageTypes().get(5)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = VirtualidentityProto.scalaDescriptor.messages(5)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = edu.uci.ics.amber.engine.common.virtualidentity.LayerIdentity
      case 2 => __out = edu.uci.ics.amber.engine.common.virtualidentity.ActorVirtualIdentity
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = edu.uci.ics.amber.engine.common.virtualidentity.WorkerIdentity(
    operator = edu.uci.ics.amber.engine.common.virtualidentity.LayerIdentity.defaultInstance,
    actor = edu.uci.ics.amber.engine.common.virtualidentity.ActorVirtualIdentity.defaultInstance
  )
  implicit class WorkerIdentityLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, edu.uci.ics.amber.engine.common.virtualidentity.WorkerIdentity]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, edu.uci.ics.amber.engine.common.virtualidentity.WorkerIdentity](_l) {
    def operator: _root_.scalapb.lenses.Lens[UpperPB, edu.uci.ics.amber.engine.common.virtualidentity.LayerIdentity] = field(_.operator)((c_, f_) => c_.copy(operator = f_))
    def actor: _root_.scalapb.lenses.Lens[UpperPB, edu.uci.ics.amber.engine.common.virtualidentity.ActorVirtualIdentity] = field(_.actor)((c_, f_) => c_.copy(actor = f_))
  }
  final val OPERATOR_FIELD_NUMBER = 1
  final val ACTOR_FIELD_NUMBER = 2
  def of(
    operator: edu.uci.ics.amber.engine.common.virtualidentity.LayerIdentity,
    actor: edu.uci.ics.amber.engine.common.virtualidentity.ActorVirtualIdentity
  ): _root_.edu.uci.ics.amber.engine.common.virtualidentity.WorkerIdentity = _root_.edu.uci.ics.amber.engine.common.virtualidentity.WorkerIdentity(
    operator,
    actor
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[edu.uci.ics.amber.engine.common.WorkerIdentity])
}