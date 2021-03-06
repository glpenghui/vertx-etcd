// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.coreos.jetcd.api;

public interface TxnResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.TxnResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  ResponseHeader getHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  ResponseHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * succeeded is set to true if the compare evaluated to true or false otherwise.
   * </pre>
   *
   * <code>bool succeeded = 2;</code>
   */
  boolean getSucceeded();

  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
   */
  java.util.List<ResponseOp>
      getResponsesList();
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
   */
  ResponseOp getResponses(int index);
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
   */
  int getResponsesCount();
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
   */
  java.util.List<? extends ResponseOpOrBuilder>
      getResponsesOrBuilderList();
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
   */
  ResponseOpOrBuilder getResponsesOrBuilder(
    int index);
}
