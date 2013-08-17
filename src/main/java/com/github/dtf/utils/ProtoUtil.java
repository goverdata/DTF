package com.github.dtf.utils;

import com.github.dtf.rpc.RPC;
import com.github.dtf.rpc.RpcPayloadHeaderProtos.RpcKindProto;
import com.github.dtf.rpc.RpcPayloadHeaderProtos.RpcPayloadHeaderProto;
import com.github.dtf.rpc.RpcPayloadHeaderProtos.RpcPayloadOperationProto;


public class ProtoUtil {
	static RpcKindProto convert(RPC.Type kind) {
	    switch (kind) {
	    case RPC_BUILTIN: return RpcKindProto.RPC_BUILTIN;
	    case RPC_WRITABLE: return RpcKindProto.RPC_WRITABLE;
	    case RPC_PROTOCOL_BUFFER: return RpcKindProto.RPC_PROTOCOL_BUFFER;
	    }
	    return null;
	  }
	  
	  
	  public static RPC.Type convert( RpcKindProto kind) {
	    switch (kind) {
	    case RPC_BUILTIN: return RPC.Type.RPC_BUILTIN;
	    case RPC_WRITABLE: return RPC.Type.RPC_WRITABLE;
	    case RPC_PROTOCOL_BUFFER: return RPC.Type.RPC_PROTOCOL_BUFFER;
	    }
	    return null;
	  }
	 
	  public static RpcPayloadHeaderProto makeRpcPayloadHeader(RPC.Type rpcKind,
	      RpcPayloadOperationProto operation, int callId) {
	    RpcPayloadHeaderProto.Builder result = RpcPayloadHeaderProto.newBuilder();
	    result.setRpcKind(convert(rpcKind)).setRpcOp(operation).setCallId(callId);
	    return result.build();
	  }
}
