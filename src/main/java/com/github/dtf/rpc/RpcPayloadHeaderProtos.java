package com.github.dtf.rpc;



public final class RpcPayloadHeaderProtos {
	  private RpcPayloadHeaderProtos() {}
	  public static void registerAllExtensions(
	      com.google.protobuf.ExtensionRegistry registry) {
	  }
	  public enum RpcKindProto
	      implements com.google.protobuf.ProtocolMessageEnum {
	    RPC_BUILTIN(0, 0),
	    RPC_WRITABLE(1, 1),
	    RPC_PROTOCOL_BUFFER(2, 2),
	    ;
	    
	    public static final int RPC_BUILTIN_VALUE = 0;
	    public static final int RPC_WRITABLE_VALUE = 1;
	    public static final int RPC_PROTOCOL_BUFFER_VALUE = 2;
	    
	    
	    public final int getNumber() { return value; }
	    
	    public static RpcKindProto valueOf(int value) {
	      switch (value) {
	        case 0: return RPC_BUILTIN;
	        case 1: return RPC_WRITABLE;
	        case 2: return RPC_PROTOCOL_BUFFER;
	        default: return null;
	      }
	    }
	    
	    public static com.google.protobuf.Internal.EnumLiteMap<RpcKindProto>
	        internalGetValueMap() {
	      return internalValueMap;
	    }
	    private static com.google.protobuf.Internal.EnumLiteMap<RpcKindProto>
	        internalValueMap =
	          new com.google.protobuf.Internal.EnumLiteMap<RpcKindProto>() {
	            public RpcKindProto findValueByNumber(int number) {
	              return RpcKindProto.valueOf(number);
	            }
	          };
	    
	    public final com.google.protobuf.Descriptors.EnumValueDescriptor
	        getValueDescriptor() {
	      return getDescriptor().getValues().get(index);
	    }
	    public final com.google.protobuf.Descriptors.EnumDescriptor
	        getDescriptorForType() {
	      return getDescriptor();
	    }
	    public static final com.google.protobuf.Descriptors.EnumDescriptor
	        getDescriptor() {
	      return org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.getDescriptor().getEnumTypes().get(0);
	    }
	    
	    private static final RpcKindProto[] VALUES = {
	      RPC_BUILTIN, RPC_WRITABLE, RPC_PROTOCOL_BUFFER, 
	    };
	    
	    public static RpcKindProto valueOf(
	        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
	      if (desc.getType() != getDescriptor()) {
	        throw new java.lang.IllegalArgumentException(
	          "EnumValueDescriptor is not for this type.");
	      }
	      return VALUES[desc.getIndex()];
	    }
	    
	    private final int index;
	    private final int value;
	    
	    private RpcKindProto(int index, int value) {
	      this.index = index;
	      this.value = value;
	    }
	    
	    // @@protoc_insertion_point(enum_scope:RpcKindProto)
	  }
	  
	  public enum RpcPayloadOperationProto
	      implements com.google.protobuf.ProtocolMessageEnum {
	    RPC_FINAL_PAYLOAD(0, 0),
	    RPC_CONTINUATION_PAYLOAD(1, 1),
	    RPC_CLOSE_CONNECTION(2, 2),
	    ;
	    
	    public static final int RPC_FINAL_PAYLOAD_VALUE = 0;
	    public static final int RPC_CONTINUATION_PAYLOAD_VALUE = 1;
	    public static final int RPC_CLOSE_CONNECTION_VALUE = 2;
	    
	    
	    public final int getNumber() { return value; }
	    
	    public static RpcPayloadOperationProto valueOf(int value) {
	      switch (value) {
	        case 0: return RPC_FINAL_PAYLOAD;
	        case 1: return RPC_CONTINUATION_PAYLOAD;
	        case 2: return RPC_CLOSE_CONNECTION;
	        default: return null;
	      }
	    }
	    
	    public static com.google.protobuf.Internal.EnumLiteMap<RpcPayloadOperationProto>
	        internalGetValueMap() {
	      return internalValueMap;
	    }
	    private static com.google.protobuf.Internal.EnumLiteMap<RpcPayloadOperationProto>
	        internalValueMap =
	          new com.google.protobuf.Internal.EnumLiteMap<RpcPayloadOperationProto>() {
	            public RpcPayloadOperationProto findValueByNumber(int number) {
	              return RpcPayloadOperationProto.valueOf(number);
	            }
	          };
	    
	    public final com.google.protobuf.Descriptors.EnumValueDescriptor
	        getValueDescriptor() {
	      return getDescriptor().getValues().get(index);
	    }
	    public final com.google.protobuf.Descriptors.EnumDescriptor
	        getDescriptorForType() {
	      return getDescriptor();
	    }
	    public static final com.google.protobuf.Descriptors.EnumDescriptor
	        getDescriptor() {
	      return org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.getDescriptor().getEnumTypes().get(1);
	    }
	    
	    private static final RpcPayloadOperationProto[] VALUES = {
	      RPC_FINAL_PAYLOAD, RPC_CONTINUATION_PAYLOAD, RPC_CLOSE_CONNECTION, 
	    };
	    
	    public static RpcPayloadOperationProto valueOf(
	        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
	      if (desc.getType() != getDescriptor()) {
	        throw new java.lang.IllegalArgumentException(
	          "EnumValueDescriptor is not for this type.");
	      }
	      return VALUES[desc.getIndex()];
	    }
	    
	    private final int index;
	    private final int value;
	    
	    private RpcPayloadOperationProto(int index, int value) {
	      this.index = index;
	      this.value = value;
	    }
	    
	    // @@protoc_insertion_point(enum_scope:RpcPayloadOperationProto)
	  }
	  
	  public enum RpcStatusProto
	      implements com.google.protobuf.ProtocolMessageEnum {
	    SUCCESS(0, 0),
	    ERROR(1, 1),
	    FATAL(2, 2),
	    ;
	    
	    public static final int SUCCESS_VALUE = 0;
	    public static final int ERROR_VALUE = 1;
	    public static final int FATAL_VALUE = 2;
	    
	    
	    public final int getNumber() { return value; }
	    
	    public static RpcStatusProto valueOf(int value) {
	      switch (value) {
	        case 0: return SUCCESS;
	        case 1: return ERROR;
	        case 2: return FATAL;
	        default: return null;
	      }
	    }
	    
	    public static com.google.protobuf.Internal.EnumLiteMap<RpcStatusProto>
	        internalGetValueMap() {
	      return internalValueMap;
	    }
	    private static com.google.protobuf.Internal.EnumLiteMap<RpcStatusProto>
	        internalValueMap =
	          new com.google.protobuf.Internal.EnumLiteMap<RpcStatusProto>() {
	            public RpcStatusProto findValueByNumber(int number) {
	              return RpcStatusProto.valueOf(number);
	            }
	          };
	    
	    public final com.google.protobuf.Descriptors.EnumValueDescriptor
	        getValueDescriptor() {
	      return getDescriptor().getValues().get(index);
	    }
	    public final com.google.protobuf.Descriptors.EnumDescriptor
	        getDescriptorForType() {
	      return getDescriptor();
	    }
	    public static final com.google.protobuf.Descriptors.EnumDescriptor
	        getDescriptor() {
	      return org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.getDescriptor().getEnumTypes().get(2);
	    }
	    
	    private static final RpcStatusProto[] VALUES = {
	      SUCCESS, ERROR, FATAL, 
	    };
	    
	    public static RpcStatusProto valueOf(
	        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
	      if (desc.getType() != getDescriptor()) {
	        throw new java.lang.IllegalArgumentException(
	          "EnumValueDescriptor is not for this type.");
	      }
	      return VALUES[desc.getIndex()];
	    }
	    
	    private final int index;
	    private final int value;
	    
	    private RpcStatusProto(int index, int value) {
	      this.index = index;
	      this.value = value;
	    }
	    
	    // @@protoc_insertion_point(enum_scope:RpcStatusProto)
	  }
	  
	  public interface RpcPayloadHeaderProtoOrBuilder
	      extends com.google.protobuf.MessageOrBuilder {
	    
	    // optional .RpcKindProto rpcKind = 1;
	    boolean hasRpcKind();
	    org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcKindProto getRpcKind();
	    
	    // optional .RpcPayloadOperationProto rpcOp = 2;
	    boolean hasRpcOp();
	    org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadOperationProto getRpcOp();
	    
	    // required uint32 callId = 3;
	    boolean hasCallId();
	    int getCallId();
	  }
	  public static final class RpcPayloadHeaderProto extends
	      com.google.protobuf.GeneratedMessage
	      implements RpcPayloadHeaderProtoOrBuilder {
	    // Use RpcPayloadHeaderProto.newBuilder() to construct.
	    private RpcPayloadHeaderProto(Builder builder) {
	      super(builder);
	    }
	    private RpcPayloadHeaderProto(boolean noInit) {}
	    
	    private static final RpcPayloadHeaderProto defaultInstance;
	    public static RpcPayloadHeaderProto getDefaultInstance() {
	      return defaultInstance;
	    }
	    
	    public RpcPayloadHeaderProto getDefaultInstanceForType() {
	      return defaultInstance;
	    }
	    
	    public static final com.google.protobuf.Descriptors.Descriptor
	        getDescriptor() {
	      return org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.internal_static_RpcPayloadHeaderProto_descriptor;
	    }
	    
	    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
	        internalGetFieldAccessorTable() {
	      return org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.internal_static_RpcPayloadHeaderProto_fieldAccessorTable;
	    }
	    
	    private int bitField0_;
	    // optional .RpcKindProto rpcKind = 1;
	    public static final int RPCKIND_FIELD_NUMBER = 1;
	    private org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcKindProto rpcKind_;
	    public boolean hasRpcKind() {
	      return ((bitField0_ & 0x00000001) == 0x00000001);
	    }
	    public org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcKindProto getRpcKind() {
	      return rpcKind_;
	    }
	    
	    // optional .RpcPayloadOperationProto rpcOp = 2;
	    public static final int RPCOP_FIELD_NUMBER = 2;
	    private org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadOperationProto rpcOp_;
	    public boolean hasRpcOp() {
	      return ((bitField0_ & 0x00000002) == 0x00000002);
	    }
	    public org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadOperationProto getRpcOp() {
	      return rpcOp_;
	    }
	    
	    // required uint32 callId = 3;
	    public static final int CALLID_FIELD_NUMBER = 3;
	    private int callId_;
	    public boolean hasCallId() {
	      return ((bitField0_ & 0x00000004) == 0x00000004);
	    }
	    public int getCallId() {
	      return callId_;
	    }
	    
	    private void initFields() {
	      rpcKind_ = org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcKindProto.RPC_BUILTIN;
	      rpcOp_ = org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadOperationProto.RPC_FINAL_PAYLOAD;
	      callId_ = 0;
	    }
	    private byte memoizedIsInitialized = -1;
	    public final boolean isInitialized() {
	      byte isInitialized = memoizedIsInitialized;
	      if (isInitialized != -1) return isInitialized == 1;
	      
	      if (!hasCallId()) {
	        memoizedIsInitialized = 0;
	        return false;
	      }
	      memoizedIsInitialized = 1;
	      return true;
	    }
	    
	    public void writeTo(com.google.protobuf.CodedOutputStream output)
	                        throws java.io.IOException {
	      getSerializedSize();
	      if (((bitField0_ & 0x00000001) == 0x00000001)) {
	        output.writeEnum(1, rpcKind_.getNumber());
	      }
	      if (((bitField0_ & 0x00000002) == 0x00000002)) {
	        output.writeEnum(2, rpcOp_.getNumber());
	      }
	      if (((bitField0_ & 0x00000004) == 0x00000004)) {
	        output.writeUInt32(3, callId_);
	      }
	      getUnknownFields().writeTo(output);
	    }
	    
	    private int memoizedSerializedSize = -1;
	    public int getSerializedSize() {
	      int size = memoizedSerializedSize;
	      if (size != -1) return size;
	    
	      size = 0;
	      if (((bitField0_ & 0x00000001) == 0x00000001)) {
	        size += com.google.protobuf.CodedOutputStream
	          .computeEnumSize(1, rpcKind_.getNumber());
	      }
	      if (((bitField0_ & 0x00000002) == 0x00000002)) {
	        size += com.google.protobuf.CodedOutputStream
	          .computeEnumSize(2, rpcOp_.getNumber());
	      }
	      if (((bitField0_ & 0x00000004) == 0x00000004)) {
	        size += com.google.protobuf.CodedOutputStream
	          .computeUInt32Size(3, callId_);
	      }
	      size += getUnknownFields().getSerializedSize();
	      memoizedSerializedSize = size;
	      return size;
	    }
	    
	    private static final long serialVersionUID = 0L;
	    @java.lang.Override
	    protected java.lang.Object writeReplace()
	        throws java.io.ObjectStreamException {
	      return super.writeReplace();
	    }
	    
	    @java.lang.Override
	    public boolean equals(final java.lang.Object obj) {
	      if (obj == this) {
	       return true;
	      }
	      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto)) {
	        return super.equals(obj);
	      }
	      org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto other = (org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto) obj;
	      
	      boolean result = true;
	      result = result && (hasRpcKind() == other.hasRpcKind());
	      if (hasRpcKind()) {
	        result = result &&
	            (getRpcKind() == other.getRpcKind());
	      }
	      result = result && (hasRpcOp() == other.hasRpcOp());
	      if (hasRpcOp()) {
	        result = result &&
	            (getRpcOp() == other.getRpcOp());
	      }
	      result = result && (hasCallId() == other.hasCallId());
	      if (hasCallId()) {
	        result = result && (getCallId()
	            == other.getCallId());
	      }
	      result = result &&
	          getUnknownFields().equals(other.getUnknownFields());
	      return result;
	    }
	    
	    @java.lang.Override
	    public int hashCode() {
	      int hash = 41;
	      hash = (19 * hash) + getDescriptorForType().hashCode();
	      if (hasRpcKind()) {
	        hash = (37 * hash) + RPCKIND_FIELD_NUMBER;
	        hash = (53 * hash) + hashEnum(getRpcKind());
	      }
	      if (hasRpcOp()) {
	        hash = (37 * hash) + RPCOP_FIELD_NUMBER;
	        hash = (53 * hash) + hashEnum(getRpcOp());
	      }
	      if (hasCallId()) {
	        hash = (37 * hash) + CALLID_FIELD_NUMBER;
	        hash = (53 * hash) + getCallId();
	      }
	      hash = (29 * hash) + getUnknownFields().hashCode();
	      return hash;
	    }
	    
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto parseFrom(
	        com.google.protobuf.ByteString data)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      return newBuilder().mergeFrom(data).buildParsed();
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto parseFrom(
	        com.google.protobuf.ByteString data,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      return newBuilder().mergeFrom(data, extensionRegistry)
	               .buildParsed();
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto parseFrom(byte[] data)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      return newBuilder().mergeFrom(data).buildParsed();
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto parseFrom(
	        byte[] data,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      return newBuilder().mergeFrom(data, extensionRegistry)
	               .buildParsed();
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto parseFrom(java.io.InputStream input)
	        throws java.io.IOException {
	      return newBuilder().mergeFrom(input).buildParsed();
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto parseFrom(
	        java.io.InputStream input,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws java.io.IOException {
	      return newBuilder().mergeFrom(input, extensionRegistry)
	               .buildParsed();
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto parseDelimitedFrom(java.io.InputStream input)
	        throws java.io.IOException {
	      Builder builder = newBuilder();
	      if (builder.mergeDelimitedFrom(input)) {
	        return builder.buildParsed();
	      } else {
	        return null;
	      }
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto parseDelimitedFrom(
	        java.io.InputStream input,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws java.io.IOException {
	      Builder builder = newBuilder();
	      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
	        return builder.buildParsed();
	      } else {
	        return null;
	      }
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto parseFrom(
	        com.google.protobuf.CodedInputStream input)
	        throws java.io.IOException {
	      return newBuilder().mergeFrom(input).buildParsed();
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto parseFrom(
	        com.google.protobuf.CodedInputStream input,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws java.io.IOException {
	      return newBuilder().mergeFrom(input, extensionRegistry)
	               .buildParsed();
	    }
	    
	    public static Builder newBuilder() { return Builder.create(); }
	    public Builder newBuilderForType() { return newBuilder(); }
	    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto prototype) {
	      return newBuilder().mergeFrom(prototype);
	    }
	    public Builder toBuilder() { return newBuilder(this); }
	    
	    @java.lang.Override
	    protected Builder newBuilderForType(
	        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
	      Builder builder = new Builder(parent);
	      return builder;
	    }
	    public static final class Builder extends
	        com.google.protobuf.GeneratedMessage.Builder<Builder>
	       implements org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProtoOrBuilder {
	      public static final com.google.protobuf.Descriptors.Descriptor
	          getDescriptor() {
	        return org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.internal_static_RpcPayloadHeaderProto_descriptor;
	      }
	      
	      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
	          internalGetFieldAccessorTable() {
	        return org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.internal_static_RpcPayloadHeaderProto_fieldAccessorTable;
	      }
	      
	      // Construct using org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto.newBuilder()
	      private Builder() {
	        maybeForceBuilderInitialization();
	      }
	      
	      private Builder(BuilderParent parent) {
	        super(parent);
	        maybeForceBuilderInitialization();
	      }
	      private void maybeForceBuilderInitialization() {
	        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
	        }
	      }
	      private static Builder create() {
	        return new Builder();
	      }
	      
	      public Builder clear() {
	        super.clear();
	        rpcKind_ = org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcKindProto.RPC_BUILTIN;
	        bitField0_ = (bitField0_ & ~0x00000001);
	        rpcOp_ = org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadOperationProto.RPC_FINAL_PAYLOAD;
	        bitField0_ = (bitField0_ & ~0x00000002);
	        callId_ = 0;
	        bitField0_ = (bitField0_ & ~0x00000004);
	        return this;
	      }
	      
	      public Builder clone() {
	        return create().mergeFrom(buildPartial());
	      }
	      
	      public com.google.protobuf.Descriptors.Descriptor
	          getDescriptorForType() {
	        return org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto.getDescriptor();
	      }
	      
	      public org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto getDefaultInstanceForType() {
	        return org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto.getDefaultInstance();
	      }
	      
	      public org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto build() {
	        org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto result = buildPartial();
	        if (!result.isInitialized()) {
	          throw newUninitializedMessageException(result);
	        }
	        return result;
	      }
	      
	      private org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto buildParsed()
	          throws com.google.protobuf.InvalidProtocolBufferException {
	        org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto result = buildPartial();
	        if (!result.isInitialized()) {
	          throw newUninitializedMessageException(
	            result).asInvalidProtocolBufferException();
	        }
	        return result;
	      }
	      
	      public org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto buildPartial() {
	        org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto result = new org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto(this);
	        int from_bitField0_ = bitField0_;
	        int to_bitField0_ = 0;
	        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
	          to_bitField0_ |= 0x00000001;
	        }
	        result.rpcKind_ = rpcKind_;
	        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
	          to_bitField0_ |= 0x00000002;
	        }
	        result.rpcOp_ = rpcOp_;
	        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
	          to_bitField0_ |= 0x00000004;
	        }
	        result.callId_ = callId_;
	        result.bitField0_ = to_bitField0_;
	        onBuilt();
	        return result;
	      }
	      
	      public Builder mergeFrom(com.google.protobuf.Message other) {
	        if (other instanceof org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto) {
	          return mergeFrom((org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto)other);
	        } else {
	          super.mergeFrom(other);
	          return this;
	        }
	      }
	      
	      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto other) {
	        if (other == org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto.getDefaultInstance()) return this;
	        if (other.hasRpcKind()) {
	          setRpcKind(other.getRpcKind());
	        }
	        if (other.hasRpcOp()) {
	          setRpcOp(other.getRpcOp());
	        }
	        if (other.hasCallId()) {
	          setCallId(other.getCallId());
	        }
	        this.mergeUnknownFields(other.getUnknownFields());
	        return this;
	      }
	      
	      public final boolean isInitialized() {
	        if (!hasCallId()) {
	          
	          return false;
	        }
	        return true;
	      }
	      
	      public Builder mergeFrom(
	          com.google.protobuf.CodedInputStream input,
	          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	          throws java.io.IOException {
	        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
	          com.google.protobuf.UnknownFieldSet.newBuilder(
	            this.getUnknownFields());
	        while (true) {
	          int tag = input.readTag();
	          switch (tag) {
	            case 0:
	              this.setUnknownFields(unknownFields.build());
	              onChanged();
	              return this;
	            default: {
	              if (!parseUnknownField(input, unknownFields,
	                                     extensionRegistry, tag)) {
	                this.setUnknownFields(unknownFields.build());
	                onChanged();
	                return this;
	              }
	              break;
	            }
	            case 8: {
	              int rawValue = input.readEnum();
	              org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcKindProto value = org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcKindProto.valueOf(rawValue);
	              if (value == null) {
	                unknownFields.mergeVarintField(1, rawValue);
	              } else {
	                bitField0_ |= 0x00000001;
	                rpcKind_ = value;
	              }
	              break;
	            }
	            case 16: {
	              int rawValue = input.readEnum();
	              org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadOperationProto value = org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadOperationProto.valueOf(rawValue);
	              if (value == null) {
	                unknownFields.mergeVarintField(2, rawValue);
	              } else {
	                bitField0_ |= 0x00000002;
	                rpcOp_ = value;
	              }
	              break;
	            }
	            case 24: {
	              bitField0_ |= 0x00000004;
	              callId_ = input.readUInt32();
	              break;
	            }
	          }
	        }
	      }
	      
	      private int bitField0_;
	      
	      // optional .RpcKindProto rpcKind = 1;
	      private org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcKindProto rpcKind_ = org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcKindProto.RPC_BUILTIN;
	      public boolean hasRpcKind() {
	        return ((bitField0_ & 0x00000001) == 0x00000001);
	      }
	      public org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcKindProto getRpcKind() {
	        return rpcKind_;
	      }
	      public Builder setRpcKind(org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcKindProto value) {
	        if (value == null) {
	          throw new NullPointerException();
	        }
	        bitField0_ |= 0x00000001;
	        rpcKind_ = value;
	        onChanged();
	        return this;
	      }
	      public Builder clearRpcKind() {
	        bitField0_ = (bitField0_ & ~0x00000001);
	        rpcKind_ = org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcKindProto.RPC_BUILTIN;
	        onChanged();
	        return this;
	      }
	      
	      // optional .RpcPayloadOperationProto rpcOp = 2;
	      private org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadOperationProto rpcOp_ = org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadOperationProto.RPC_FINAL_PAYLOAD;
	      public boolean hasRpcOp() {
	        return ((bitField0_ & 0x00000002) == 0x00000002);
	      }
	      public org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadOperationProto getRpcOp() {
	        return rpcOp_;
	      }
	      public Builder setRpcOp(org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadOperationProto value) {
	        if (value == null) {
	          throw new NullPointerException();
	        }
	        bitField0_ |= 0x00000002;
	        rpcOp_ = value;
	        onChanged();
	        return this;
	      }
	      public Builder clearRpcOp() {
	        bitField0_ = (bitField0_ & ~0x00000002);
	        rpcOp_ = org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadOperationProto.RPC_FINAL_PAYLOAD;
	        onChanged();
	        return this;
	      }
	      
	      // required uint32 callId = 3;
	      private int callId_ ;
	      public boolean hasCallId() {
	        return ((bitField0_ & 0x00000004) == 0x00000004);
	      }
	      public int getCallId() {
	        return callId_;
	      }
	      public Builder setCallId(int value) {
	        bitField0_ |= 0x00000004;
	        callId_ = value;
	        onChanged();
	        return this;
	      }
	      public Builder clearCallId() {
	        bitField0_ = (bitField0_ & ~0x00000004);
	        callId_ = 0;
	        onChanged();
	        return this;
	      }
	      
	      // @@protoc_insertion_point(builder_scope:RpcPayloadHeaderProto)
	    }
	    
	    static {
	      defaultInstance = new RpcPayloadHeaderProto(true);
	      defaultInstance.initFields();
	    }
	    
	    // @@protoc_insertion_point(class_scope:RpcPayloadHeaderProto)
	  }
	  
	  public interface RpcResponseHeaderProtoOrBuilder
	      extends com.google.protobuf.MessageOrBuilder {
	    
	    // required uint32 callId = 1;
	    boolean hasCallId();
	    int getCallId();
	    
	    // required .RpcStatusProto status = 2;
	    boolean hasStatus();
	    org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcStatusProto getStatus();
	    
	    // optional uint32 serverIpcVersionNum = 3;
	    boolean hasServerIpcVersionNum();
	    int getServerIpcVersionNum();
	  }
	  public static final class RpcResponseHeaderProto extends
	      com.google.protobuf.GeneratedMessage
	      implements RpcResponseHeaderProtoOrBuilder {
	    // Use RpcResponseHeaderProto.newBuilder() to construct.
	    private RpcResponseHeaderProto(Builder builder) {
	      super(builder);
	    }
	    private RpcResponseHeaderProto(boolean noInit) {}
	    
	    private static final RpcResponseHeaderProto defaultInstance;
	    public static RpcResponseHeaderProto getDefaultInstance() {
	      return defaultInstance;
	    }
	    
	    public RpcResponseHeaderProto getDefaultInstanceForType() {
	      return defaultInstance;
	    }
	    
	    public static final com.google.protobuf.Descriptors.Descriptor
	        getDescriptor() {
	      return org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.internal_static_RpcResponseHeaderProto_descriptor;
	    }
	    
	    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
	        internalGetFieldAccessorTable() {
	      return org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.internal_static_RpcResponseHeaderProto_fieldAccessorTable;
	    }
	    
	    private int bitField0_;
	    // required uint32 callId = 1;
	    public static final int CALLID_FIELD_NUMBER = 1;
	    private int callId_;
	    public boolean hasCallId() {
	      return ((bitField0_ & 0x00000001) == 0x00000001);
	    }
	    public int getCallId() {
	      return callId_;
	    }
	    
	    // required .RpcStatusProto status = 2;
	    public static final int STATUS_FIELD_NUMBER = 2;
	    private org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcStatusProto status_;
	    public boolean hasStatus() {
	      return ((bitField0_ & 0x00000002) == 0x00000002);
	    }
	    public org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcStatusProto getStatus() {
	      return status_;
	    }
	    
	    // optional uint32 serverIpcVersionNum = 3;
	    public static final int SERVERIPCVERSIONNUM_FIELD_NUMBER = 3;
	    private int serverIpcVersionNum_;
	    public boolean hasServerIpcVersionNum() {
	      return ((bitField0_ & 0x00000004) == 0x00000004);
	    }
	    public int getServerIpcVersionNum() {
	      return serverIpcVersionNum_;
	    }
	    
	    private void initFields() {
	      callId_ = 0;
	      status_ = org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcStatusProto.SUCCESS;
	      serverIpcVersionNum_ = 0;
	    }
	    private byte memoizedIsInitialized = -1;
	    public final boolean isInitialized() {
	      byte isInitialized = memoizedIsInitialized;
	      if (isInitialized != -1) return isInitialized == 1;
	      
	      if (!hasCallId()) {
	        memoizedIsInitialized = 0;
	        return false;
	      }
	      if (!hasStatus()) {
	        memoizedIsInitialized = 0;
	        return false;
	      }
	      memoizedIsInitialized = 1;
	      return true;
	    }
	    
	    public void writeTo(com.google.protobuf.CodedOutputStream output)
	                        throws java.io.IOException {
	      getSerializedSize();
	      if (((bitField0_ & 0x00000001) == 0x00000001)) {
	        output.writeUInt32(1, callId_);
	      }
	      if (((bitField0_ & 0x00000002) == 0x00000002)) {
	        output.writeEnum(2, status_.getNumber());
	      }
	      if (((bitField0_ & 0x00000004) == 0x00000004)) {
	        output.writeUInt32(3, serverIpcVersionNum_);
	      }
	      getUnknownFields().writeTo(output);
	    }
	    
	    private int memoizedSerializedSize = -1;
	    public int getSerializedSize() {
	      int size = memoizedSerializedSize;
	      if (size != -1) return size;
	    
	      size = 0;
	      if (((bitField0_ & 0x00000001) == 0x00000001)) {
	        size += com.google.protobuf.CodedOutputStream
	          .computeUInt32Size(1, callId_);
	      }
	      if (((bitField0_ & 0x00000002) == 0x00000002)) {
	        size += com.google.protobuf.CodedOutputStream
	          .computeEnumSize(2, status_.getNumber());
	      }
	      if (((bitField0_ & 0x00000004) == 0x00000004)) {
	        size += com.google.protobuf.CodedOutputStream
	          .computeUInt32Size(3, serverIpcVersionNum_);
	      }
	      size += getUnknownFields().getSerializedSize();
	      memoizedSerializedSize = size;
	      return size;
	    }
	    
	    private static final long serialVersionUID = 0L;
	    @java.lang.Override
	    protected java.lang.Object writeReplace()
	        throws java.io.ObjectStreamException {
	      return super.writeReplace();
	    }
	    
	    @java.lang.Override
	    public boolean equals(final java.lang.Object obj) {
	      if (obj == this) {
	       return true;
	      }
	      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto)) {
	        return super.equals(obj);
	      }
	      org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto other = (org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto) obj;
	      
	      boolean result = true;
	      result = result && (hasCallId() == other.hasCallId());
	      if (hasCallId()) {
	        result = result && (getCallId()
	            == other.getCallId());
	      }
	      result = result && (hasStatus() == other.hasStatus());
	      if (hasStatus()) {
	        result = result &&
	            (getStatus() == other.getStatus());
	      }
	      result = result && (hasServerIpcVersionNum() == other.hasServerIpcVersionNum());
	      if (hasServerIpcVersionNum()) {
	        result = result && (getServerIpcVersionNum()
	            == other.getServerIpcVersionNum());
	      }
	      result = result &&
	          getUnknownFields().equals(other.getUnknownFields());
	      return result;
	    }
	    
	    @java.lang.Override
	    public int hashCode() {
	      int hash = 41;
	      hash = (19 * hash) + getDescriptorForType().hashCode();
	      if (hasCallId()) {
	        hash = (37 * hash) + CALLID_FIELD_NUMBER;
	        hash = (53 * hash) + getCallId();
	      }
	      if (hasStatus()) {
	        hash = (37 * hash) + STATUS_FIELD_NUMBER;
	        hash = (53 * hash) + hashEnum(getStatus());
	      }
	      if (hasServerIpcVersionNum()) {
	        hash = (37 * hash) + SERVERIPCVERSIONNUM_FIELD_NUMBER;
	        hash = (53 * hash) + getServerIpcVersionNum();
	      }
	      hash = (29 * hash) + getUnknownFields().hashCode();
	      return hash;
	    }
	    
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto parseFrom(
	        com.google.protobuf.ByteString data)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      return newBuilder().mergeFrom(data).buildParsed();
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto parseFrom(
	        com.google.protobuf.ByteString data,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      return newBuilder().mergeFrom(data, extensionRegistry)
	               .buildParsed();
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto parseFrom(byte[] data)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      return newBuilder().mergeFrom(data).buildParsed();
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto parseFrom(
	        byte[] data,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      return newBuilder().mergeFrom(data, extensionRegistry)
	               .buildParsed();
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto parseFrom(java.io.InputStream input)
	        throws java.io.IOException {
	      return newBuilder().mergeFrom(input).buildParsed();
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto parseFrom(
	        java.io.InputStream input,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws java.io.IOException {
	      return newBuilder().mergeFrom(input, extensionRegistry)
	               .buildParsed();
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto parseDelimitedFrom(java.io.InputStream input)
	        throws java.io.IOException {
	      Builder builder = newBuilder();
	      if (builder.mergeDelimitedFrom(input)) {
	        return builder.buildParsed();
	      } else {
	        return null;
	      }
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto parseDelimitedFrom(
	        java.io.InputStream input,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws java.io.IOException {
	      Builder builder = newBuilder();
	      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
	        return builder.buildParsed();
	      } else {
	        return null;
	      }
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto parseFrom(
	        com.google.protobuf.CodedInputStream input)
	        throws java.io.IOException {
	      return newBuilder().mergeFrom(input).buildParsed();
	    }
	    public static org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto parseFrom(
	        com.google.protobuf.CodedInputStream input,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws java.io.IOException {
	      return newBuilder().mergeFrom(input, extensionRegistry)
	               .buildParsed();
	    }
	    
	    public static Builder newBuilder() { return Builder.create(); }
	    public Builder newBuilderForType() { return newBuilder(); }
	    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto prototype) {
	      return newBuilder().mergeFrom(prototype);
	    }
	    public Builder toBuilder() { return newBuilder(this); }
	    
	    @java.lang.Override
	    protected Builder newBuilderForType(
	        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
	      Builder builder = new Builder(parent);
	      return builder;
	    }
	    public static final class Builder extends
	        com.google.protobuf.GeneratedMessage.Builder<Builder>
	       implements org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProtoOrBuilder {
	      public static final com.google.protobuf.Descriptors.Descriptor
	          getDescriptor() {
	        return org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.internal_static_RpcResponseHeaderProto_descriptor;
	      }
	      
	      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
	          internalGetFieldAccessorTable() {
	        return org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.internal_static_RpcResponseHeaderProto_fieldAccessorTable;
	      }
	      
	      // Construct using org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto.newBuilder()
	      private Builder() {
	        maybeForceBuilderInitialization();
	      }
	      
	      private Builder(BuilderParent parent) {
	        super(parent);
	        maybeForceBuilderInitialization();
	      }
	      private void maybeForceBuilderInitialization() {
	        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
	        }
	      }
	      private static Builder create() {
	        return new Builder();
	      }
	      
	      public Builder clear() {
	        super.clear();
	        callId_ = 0;
	        bitField0_ = (bitField0_ & ~0x00000001);
	        status_ = org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcStatusProto.SUCCESS;
	        bitField0_ = (bitField0_ & ~0x00000002);
	        serverIpcVersionNum_ = 0;
	        bitField0_ = (bitField0_ & ~0x00000004);
	        return this;
	      }
	      
	      public Builder clone() {
	        return create().mergeFrom(buildPartial());
	      }
	      
	      public com.google.protobuf.Descriptors.Descriptor
	          getDescriptorForType() {
	        return org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto.getDescriptor();
	      }
	      
	      public org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto getDefaultInstanceForType() {
	        return org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto.getDefaultInstance();
	      }
	      
	      public org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto build() {
	        org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto result = buildPartial();
	        if (!result.isInitialized()) {
	          throw newUninitializedMessageException(result);
	        }
	        return result;
	      }
	      
	      private org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto buildParsed()
	          throws com.google.protobuf.InvalidProtocolBufferException {
	        org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto result = buildPartial();
	        if (!result.isInitialized()) {
	          throw newUninitializedMessageException(
	            result).asInvalidProtocolBufferException();
	        }
	        return result;
	      }
	      
	      public org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto buildPartial() {
	        org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto result = new org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto(this);
	        int from_bitField0_ = bitField0_;
	        int to_bitField0_ = 0;
	        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
	          to_bitField0_ |= 0x00000001;
	        }
	        result.callId_ = callId_;
	        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
	          to_bitField0_ |= 0x00000002;
	        }
	        result.status_ = status_;
	        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
	          to_bitField0_ |= 0x00000004;
	        }
	        result.serverIpcVersionNum_ = serverIpcVersionNum_;
	        result.bitField0_ = to_bitField0_;
	        onBuilt();
	        return result;
	      }
	      
	      public Builder mergeFrom(com.google.protobuf.Message other) {
	        if (other instanceof org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto) {
	          return mergeFrom((org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto)other);
	        } else {
	          super.mergeFrom(other);
	          return this;
	        }
	      }
	      
	      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto other) {
	        if (other == org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto.getDefaultInstance()) return this;
	        if (other.hasCallId()) {
	          setCallId(other.getCallId());
	        }
	        if (other.hasStatus()) {
	          setStatus(other.getStatus());
	        }
	        if (other.hasServerIpcVersionNum()) {
	          setServerIpcVersionNum(other.getServerIpcVersionNum());
	        }
	        this.mergeUnknownFields(other.getUnknownFields());
	        return this;
	      }
	      
	      public final boolean isInitialized() {
	        if (!hasCallId()) {
	          
	          return false;
	        }
	        if (!hasStatus()) {
	          
	          return false;
	        }
	        return true;
	      }
	      
	      public Builder mergeFrom(
	          com.google.protobuf.CodedInputStream input,
	          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	          throws java.io.IOException {
	        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
	          com.google.protobuf.UnknownFieldSet.newBuilder(
	            this.getUnknownFields());
	        while (true) {
	          int tag = input.readTag();
	          switch (tag) {
	            case 0:
	              this.setUnknownFields(unknownFields.build());
	              onChanged();
	              return this;
	            default: {
	              if (!parseUnknownField(input, unknownFields,
	                                     extensionRegistry, tag)) {
	                this.setUnknownFields(unknownFields.build());
	                onChanged();
	                return this;
	              }
	              break;
	            }
	            case 8: {
	              bitField0_ |= 0x00000001;
	              callId_ = input.readUInt32();
	              break;
	            }
	            case 16: {
	              int rawValue = input.readEnum();
	              org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcStatusProto value = org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcStatusProto.valueOf(rawValue);
	              if (value == null) {
	                unknownFields.mergeVarintField(2, rawValue);
	              } else {
	                bitField0_ |= 0x00000002;
	                status_ = value;
	              }
	              break;
	            }
	            case 24: {
	              bitField0_ |= 0x00000004;
	              serverIpcVersionNum_ = input.readUInt32();
	              break;
	            }
	          }
	        }
	      }
	      
	      private int bitField0_;
	      
	      // required uint32 callId = 1;
	      private int callId_ ;
	      public boolean hasCallId() {
	        return ((bitField0_ & 0x00000001) == 0x00000001);
	      }
	      public int getCallId() {
	        return callId_;
	      }
	      public Builder setCallId(int value) {
	        bitField0_ |= 0x00000001;
	        callId_ = value;
	        onChanged();
	        return this;
	      }
	      public Builder clearCallId() {
	        bitField0_ = (bitField0_ & ~0x00000001);
	        callId_ = 0;
	        onChanged();
	        return this;
	      }
	      
	      // required .RpcStatusProto status = 2;
	      private org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcStatusProto status_ = org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcStatusProto.SUCCESS;
	      public boolean hasStatus() {
	        return ((bitField0_ & 0x00000002) == 0x00000002);
	      }
	      public org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcStatusProto getStatus() {
	        return status_;
	      }
	      public Builder setStatus(org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcStatusProto value) {
	        if (value == null) {
	          throw new NullPointerException();
	        }
	        bitField0_ |= 0x00000002;
	        status_ = value;
	        onChanged();
	        return this;
	      }
	      public Builder clearStatus() {
	        bitField0_ = (bitField0_ & ~0x00000002);
	        status_ = org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcStatusProto.SUCCESS;
	        onChanged();
	        return this;
	      }
	      
	      // optional uint32 serverIpcVersionNum = 3;
	      private int serverIpcVersionNum_ ;
	      public boolean hasServerIpcVersionNum() {
	        return ((bitField0_ & 0x00000004) == 0x00000004);
	      }
	      public int getServerIpcVersionNum() {
	        return serverIpcVersionNum_;
	      }
	      public Builder setServerIpcVersionNum(int value) {
	        bitField0_ |= 0x00000004;
	        serverIpcVersionNum_ = value;
	        onChanged();
	        return this;
	      }
	      public Builder clearServerIpcVersionNum() {
	        bitField0_ = (bitField0_ & ~0x00000004);
	        serverIpcVersionNum_ = 0;
	        onChanged();
	        return this;
	      }
	      
	      // @@protoc_insertion_point(builder_scope:RpcResponseHeaderProto)
	    }
	    
	    static {
	      defaultInstance = new RpcResponseHeaderProto(true);
	      defaultInstance.initFields();
	    }
	    
	    // @@protoc_insertion_point(class_scope:RpcResponseHeaderProto)
	  }
	  
	  private static com.google.protobuf.Descriptors.Descriptor
	    internal_static_RpcPayloadHeaderProto_descriptor;
	  private static
	    com.google.protobuf.GeneratedMessage.FieldAccessorTable
	      internal_static_RpcPayloadHeaderProto_fieldAccessorTable;
	  private static com.google.protobuf.Descriptors.Descriptor
	    internal_static_RpcResponseHeaderProto_descriptor;
	  private static
	    com.google.protobuf.GeneratedMessage.FieldAccessorTable
	      internal_static_RpcResponseHeaderProto_fieldAccessorTable;
	  
	  public static com.google.protobuf.Descriptors.FileDescriptor
	      getDescriptor() {
	    return descriptor;
	  }
	  private static com.google.protobuf.Descriptors.FileDescriptor
	      descriptor;
	  static {
	    java.lang.String[] descriptorData = {
	      "\n\026RpcPayloadHeader.proto\"q\n\025RpcPayloadHe" +
	      "aderProto\022\036\n\007rpcKind\030\001 \001(\0162\r.RpcKindProt" +
	      "o\022(\n\005rpcOp\030\002 \001(\0162\031.RpcPayloadOperationPr" +
	      "oto\022\016\n\006callId\030\003 \002(\r\"f\n\026RpcResponseHeader" +
	      "Proto\022\016\n\006callId\030\001 \002(\r\022\037\n\006status\030\002 \002(\0162\017." +
	      "RpcStatusProto\022\033\n\023serverIpcVersionNum\030\003 " +
	      "\001(\r*J\n\014RpcKindProto\022\017\n\013RPC_BUILTIN\020\000\022\020\n\014" +
	      "RPC_WRITABLE\020\001\022\027\n\023RPC_PROTOCOL_BUFFER\020\002*" +
	      "i\n\030RpcPayloadOperationProto\022\025\n\021RPC_FINAL" +
	      "_PAYLOAD\020\000\022\034\n\030RPC_CONTINUATION_PAYLOAD\020\001",
	      "\022\030\n\024RPC_CLOSE_CONNECTION\020\002*3\n\016RpcStatusP" +
	      "roto\022\013\n\007SUCCESS\020\000\022\t\n\005ERROR\020\001\022\t\n\005FATAL\020\002B" +
	      ";\n\036org.apache.hadoop.ipc.protobufB\026RpcPa" +
	      "yloadHeaderProtos\240\001\001"
	    };
	    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
	      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
	        public com.google.protobuf.ExtensionRegistry assignDescriptors(
	            com.google.protobuf.Descriptors.FileDescriptor root) {
	          descriptor = root;
	          internal_static_RpcPayloadHeaderProto_descriptor =
	            getDescriptor().getMessageTypes().get(0);
	          internal_static_RpcPayloadHeaderProto_fieldAccessorTable = new
	            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
	              internal_static_RpcPayloadHeaderProto_descriptor,
	              new java.lang.String[] { "RpcKind", "RpcOp", "CallId", },
	              org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto.class,
	              org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcPayloadHeaderProto.Builder.class);
	          internal_static_RpcResponseHeaderProto_descriptor =
	            getDescriptor().getMessageTypes().get(1);
	          internal_static_RpcResponseHeaderProto_fieldAccessorTable = new
	            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
	              internal_static_RpcResponseHeaderProto_descriptor,
	              new java.lang.String[] { "CallId", "Status", "ServerIpcVersionNum", },
	              org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto.class,
	              org.apache.hadoop.ipc.protobuf.RpcPayloadHeaderProtos.RpcResponseHeaderProto.Builder.class);
	          return null;
	        }
	      };
	    com.google.protobuf.Descriptors.FileDescriptor
	      .internalBuildGeneratedFileFrom(descriptorData,
	        new com.google.protobuf.Descriptors.FileDescriptor[] {
	        }, assigner);
	  }
	  
	  // @@protoc_insertion_point(outer_class_scope)
	}