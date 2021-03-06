// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.coreos.jetcd.api;

public interface HashResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.HashResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  com.coreos.jetcd.api.ResponseHeader getHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  com.coreos.jetcd.api.ResponseHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * hash is the hash value computed from the responding member's key-value store.
   * </pre>
   *
   * <code>uint32 hash = 2;</code>
   */
  int getHash();
}
