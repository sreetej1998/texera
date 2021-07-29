// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package edu.uci.ics.amber.engine.architecture.worker.controlcommands

object ControlcommandsProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    edu.uci.ics.amber.engine.architecture.sendsemantics.partitionings.PartitioningsProto,
    edu.uci.ics.amber.engine.common.virtualidentity.VirtualidentityProto,
    scalapb.options.ScalapbProto
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      edu.uci.ics.amber.engine.architecture.worker.controlcommands.StartWorkerV2,
      edu.uci.ics.amber.engine.architecture.worker.controlcommands.PauseWorkerV2,
      edu.uci.ics.amber.engine.architecture.worker.controlcommands.ResumeWorkerV2,
      edu.uci.ics.amber.engine.architecture.worker.controlcommands.UpdateInputLinkingV2,
      edu.uci.ics.amber.engine.architecture.worker.controlcommands.AddPartitioningV2,
      edu.uci.ics.amber.engine.architecture.worker.controlcommands.WorkerExecutionCompletedV2,
      edu.uci.ics.amber.engine.architecture.worker.controlcommands.ControlCommandV2Message
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """CkJlZHUvdWNpL2ljcy9hbWJlci9lbmdpbmUvYXJjaGl0ZWN0dXJlL3dvcmtlci9jb250cm9sY29tbWFuZHMucHJvdG8SLGVkd
  S51Y2kuaWNzLmFtYmVyLmVuZ2luZS5hcmNoaXRlY3R1cmUud29ya2VyGkdlZHUvdWNpL2ljcy9hbWJlci9lbmdpbmUvYXJjaGl0Z
  WN0dXJlL3NlbmRzZW1hbnRpY3MvcGFydGl0aW9uaW5ncy5wcm90bxo1ZWR1L3VjaS9pY3MvYW1iZXIvZW5naW5lL2NvbW1vbi92a
  XJ0dWFsaWRlbnRpdHkucHJvdG8aFXNjYWxhcGIvc2NhbGFwYi5wcm90byIPCg1TdGFydFdvcmtlclYyIg8KDVBhdXNlV29ya2VyV
  jIiEAoOUmVzdW1lV29ya2VyVjIi4gEKFFVwZGF0ZUlucHV0TGlua2luZ1YyEmkKCmlkZW50aWZpZXIYASABKAsyNS5lZHUudWNpL
  mljcy5hbWJlci5lbmdpbmUuY29tbW9uLkFjdG9yVmlydHVhbElkZW50aXR5QhLiPw8SCmlkZW50aWZpZXLwAQFSCmlkZW50aWZpZ
  XISXwoKaW5wdXRfbGluaxgCIAEoCzItLmVkdS51Y2kuaWNzLmFtYmVyLmVuZ2luZS5jb21tb24uTGlua0lkZW50aXR5QhHiPw4SC
  WlucHV0TGlua/ABAVIJaW5wdXRMaW5rIt4BChFBZGRQYXJ0aXRpb25pbmdWMhJMCgN0YWcYASABKAsyLS5lZHUudWNpLmljcy5hb
  WJlci5lbmdpbmUuY29tbW9uLkxpbmtJZGVudGl0eUIL4j8IEgN0YWfwAQFSA3RhZxJ7CgxwYXJ0aXRpb25pbmcYAiABKAsyQS5lZ
  HUudWNpLmljcy5hbWJlci5lbmdpbmUuYXJjaGl0ZWN0dXJlLnNlbmRzZW1hbnRpY3MuUGFydGl0aW9uaW5nQhTiPxESDHBhcnRpd
  GlvbmluZ/ABAVIMcGFydGl0aW9uaW5nIhwKGldvcmtlckV4ZWN1dGlvbkNvbXBsZXRlZFYyIsQGChBDb250cm9sQ29tbWFuZFYyE
  nIKDHN0YXJ0X3dvcmtlchgBIAEoCzI7LmVkdS51Y2kuaWNzLmFtYmVyLmVuZ2luZS5hcmNoaXRlY3R1cmUud29ya2VyLlN0YXJ0V
  29ya2VyVjJCEOI/DRILc3RhcnRXb3JrZXJIAFILc3RhcnRXb3JrZXIScgoMcGF1c2Vfd29ya2VyGAIgASgLMjsuZWR1LnVjaS5pY
  3MuYW1iZXIuZW5naW5lLmFyY2hpdGVjdHVyZS53b3JrZXIuUGF1c2VXb3JrZXJWMkIQ4j8NEgtwYXVzZVdvcmtlckgAUgtwYXVzZ
  VdvcmtlchJ2Cg1yZXN1bWVfd29ya2VyGAMgASgLMjwuZWR1LnVjaS5pY3MuYW1iZXIuZW5naW5lLmFyY2hpdGVjdHVyZS53b3JrZ
  XIuUmVzdW1lV29ya2VyVjJCEeI/DhIMcmVzdW1lV29ya2VySABSDHJlc3VtZVdvcmtlchKDAQoRYWRkX291dHB1dF9wb2xpY3kYB
  CABKAsyPy5lZHUudWNpLmljcy5hbWJlci5lbmdpbmUuYXJjaGl0ZWN0dXJlLndvcmtlci5BZGRQYXJ0aXRpb25pbmdWMkIU4j8RE
  g9hZGRPdXRwdXRQb2xpY3lIAFIPYWRkT3V0cHV0UG9saWN5Eo8BChR1cGRhdGVfaW5wdXRfbGlua2luZxgFIAEoCzJCLmVkdS51Y
  2kuaWNzLmFtYmVyLmVuZ2luZS5hcmNoaXRlY3R1cmUud29ya2VyLlVwZGF0ZUlucHV0TGlua2luZ1YyQhfiPxQSEnVwZGF0ZUluc
  HV0TGlua2luZ0gAUhJ1cGRhdGVJbnB1dExpbmtpbmcSpwEKGndvcmtlcl9leGVjdXRpb25fY29tcGxldGVkGGUgASgLMkguZWR1L
  nVjaS5pY3MuYW1iZXIuZW5naW5lLmFyY2hpdGVjdHVyZS53b3JrZXIuV29ya2VyRXhlY3V0aW9uQ29tcGxldGVkVjJCHeI/GhIYd
  29ya2VyRXhlY3V0aW9uQ29tcGxldGVkSABSGHdvcmtlckV4ZWN1dGlvbkNvbXBsZXRlZEIOCgxzZWFsZWRfdmFsdWVCCeI/BkgAW
  AB4AWIGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      edu.uci.ics.amber.engine.architecture.sendsemantics.partitionings.PartitioningsProto.javaDescriptor,
      edu.uci.ics.amber.engine.common.virtualidentity.VirtualidentityProto.javaDescriptor,
      scalapb.options.ScalapbProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}