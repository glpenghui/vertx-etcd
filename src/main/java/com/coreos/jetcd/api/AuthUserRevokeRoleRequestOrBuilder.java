// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.coreos.jetcd.api;

public interface AuthUserRevokeRoleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.AuthUserRevokeRoleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string role = 2;</code>
   */
  String getRole();
  /**
   * <code>string role = 2;</code>
   */
  com.google.protobuf.ByteString
      getRoleBytes();
}
