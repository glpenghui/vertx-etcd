// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.coreos.jetcd.api;

/**
 * Protobuf type {@code etcdserverpb.LeaseKeepAliveRequest}
 */
public  final class LeaseKeepAliveRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.LeaseKeepAliveRequest)
    LeaseKeepAliveRequestOrBuilder {
  // Use LeaseKeepAliveRequest.newBuilder() to construct.
  private LeaseKeepAliveRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LeaseKeepAliveRequest() {
    iD_ = 0L;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LeaseKeepAliveRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            iD_ = input.readInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return JetcdProto.internal_static_etcdserverpb_LeaseKeepAliveRequest_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return JetcdProto.internal_static_etcdserverpb_LeaseKeepAliveRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            LeaseKeepAliveRequest.class, Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long iD_;
  /**
   * <pre>
   * ID is the lease ID for the lease to keep alive.
   * </pre>
   *
   * <code>int64 ID = 1;</code>
   */
  public long getID() {
    return iD_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (iD_ != 0L) {
      output.writeInt64(1, iD_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (iD_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, iD_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof LeaseKeepAliveRequest)) {
      return super.equals(obj);
    }
    LeaseKeepAliveRequest other = (LeaseKeepAliveRequest) obj;

    boolean result = true;
    result = result && (getID()
        == other.getID());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getID());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static LeaseKeepAliveRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LeaseKeepAliveRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LeaseKeepAliveRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LeaseKeepAliveRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LeaseKeepAliveRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LeaseKeepAliveRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LeaseKeepAliveRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static LeaseKeepAliveRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static LeaseKeepAliveRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static LeaseKeepAliveRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static LeaseKeepAliveRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static LeaseKeepAliveRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(LeaseKeepAliveRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code etcdserverpb.LeaseKeepAliveRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.LeaseKeepAliveRequest)
      com.coreos.jetcd.api.LeaseKeepAliveRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return JetcdProto.internal_static_etcdserverpb_LeaseKeepAliveRequest_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return JetcdProto.internal_static_etcdserverpb_LeaseKeepAliveRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LeaseKeepAliveRequest.class, Builder.class);
    }

    // Construct using com.coreos.jetcd.api.LeaseKeepAliveRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      iD_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return JetcdProto.internal_static_etcdserverpb_LeaseKeepAliveRequest_descriptor;
    }

    public LeaseKeepAliveRequest getDefaultInstanceForType() {
      return LeaseKeepAliveRequest.getDefaultInstance();
    }

    public LeaseKeepAliveRequest build() {
      LeaseKeepAliveRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public LeaseKeepAliveRequest buildPartial() {
      LeaseKeepAliveRequest result = new LeaseKeepAliveRequest(this);
      result.iD_ = iD_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof LeaseKeepAliveRequest) {
        return mergeFrom((LeaseKeepAliveRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(LeaseKeepAliveRequest other) {
      if (other == LeaseKeepAliveRequest.getDefaultInstance()) return this;
      if (other.getID() != 0L) {
        setID(other.getID());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      LeaseKeepAliveRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (LeaseKeepAliveRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long iD_ ;
    /**
     * <pre>
     * ID is the lease ID for the lease to keep alive.
     * </pre>
     *
     * <code>int64 ID = 1;</code>
     */
    public long getID() {
      return iD_;
    }
    /**
     * <pre>
     * ID is the lease ID for the lease to keep alive.
     * </pre>
     *
     * <code>int64 ID = 1;</code>
     */
    public Builder setID(long value) {
      
      iD_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID is the lease ID for the lease to keep alive.
     * </pre>
     *
     * <code>int64 ID = 1;</code>
     */
    public Builder clearID() {
      
      iD_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:etcdserverpb.LeaseKeepAliveRequest)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.LeaseKeepAliveRequest)
  private static final LeaseKeepAliveRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new LeaseKeepAliveRequest();
  }

  public static LeaseKeepAliveRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LeaseKeepAliveRequest>
      PARSER = new com.google.protobuf.AbstractParser<LeaseKeepAliveRequest>() {
    public LeaseKeepAliveRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new LeaseKeepAliveRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LeaseKeepAliveRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<LeaseKeepAliveRequest> getParserForType() {
    return PARSER;
  }

  public LeaseKeepAliveRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

