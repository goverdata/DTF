package com.github.dtf.rpc.server;

import java.nio.ByteBuffer;

import com.github.dtf.rpc.Writable;

/** A call queued for handling. */
public class Call {
  private final int callId;             // the client's call id
  private final Writable rpcRequest;    // Serialized Rpc request from client
  private final Connection connection;  // connection to client
  private long timestamp;               // time received when response is null
                                        // time served when response is not null
  private ByteBuffer rpcResponse;       // the response for this call
  private final RPC.RpcKind rpcKind;

  public Call(int id, Writable param, Connection connection) {
    this( id,  param,  connection, RPC.RpcKind.RPC_BUILTIN );    
  }
  public Call(int id, Writable param, Connection connection, RPC.RpcKind kind) { 
    this.callId = id;
    this.rpcRequest = param;
    this.connection = connection;
    this.timestamp = Time.now();
    this.rpcResponse = null;
    this.rpcKind = kind;
  }
  
  @Override
  public String toString() {
    return rpcRequest.toString() + " from " + connection.toString();
  }

  public void setResponse(ByteBuffer response) {
    this.rpcResponse = response;
  }
}