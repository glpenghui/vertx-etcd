// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.coreos.jetcd.api;

public interface ResponseOpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.ResponseOp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.etcdserverpb.RangeResponse response_range = 1;</code>
   */
  RangeResponse getResponseRange();
  /**
   * <code>.etcdserverpb.RangeResponse response_range = 1;</code>
   */
  RangeResponseOrBuilder getResponseRangeOrBuilder();

  /**
   * <code>.etcdserverpb.PutResponse response_put = 2;</code>
   */
  PutResponse getResponsePut();
  /**
   * <code>.etcdserverpb.PutResponse response_put = 2;</code>
   */
  PutResponseOrBuilder getResponsePutOrBuilder();

  /**
   * <code>.etcdserverpb.DeleteRangeResponse response_delete_range = 3;</code>
   */
  DeleteRangeResponse getResponseDeleteRange();
  /**
   * <code>.etcdserverpb.DeleteRangeResponse response_delete_range = 3;</code>
   */
  DeleteRangeResponseOrBuilder getResponseDeleteRangeOrBuilder();

  /**
   * <code>.etcdserverpb.TxnResponse response_txn = 4;</code>
   */
  com.coreos.jetcd.api.TxnResponse getResponseTxn();
  /**
   * <code>.etcdserverpb.TxnResponse response_txn = 4;</code>
   */
  com.coreos.jetcd.api.TxnResponseOrBuilder getResponseTxnOrBuilder();

  public ResponseOp.ResponseCase getResponseCase();
}
