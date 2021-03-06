// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.coreos.jetcd.api;

/**
 * Protobuf type {@code etcdserverpb.Member}
 */
public  final class Member extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.Member)
    MemberOrBuilder {
  // Use Member.newBuilder() to construct.
  private Member(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Member() {
    iD_ = 0L;
    name_ = "";
    peerURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    clientURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Member(
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

            iD_ = input.readUInt64();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              peerURLs_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            peerURLs_.add(s);
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              clientURLs_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000008;
            }
            clientURLs_.add(s);
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        peerURLs_ = peerURLs_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        clientURLs_ = clientURLs_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return JetcdProto.internal_static_etcdserverpb_Member_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return JetcdProto.internal_static_etcdserverpb_Member_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Member.class, Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private long iD_;
  /**
   * <pre>
   * ID is the member ID for this member.
   * </pre>
   *
   * <code>uint64 ID = 1;</code>
   */
  public long getID() {
    return iD_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile Object name_;
  /**
   * <pre>
   * name is the human-readable name of the member. If the member is not started, the name will be an empty string.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  public String getName() {
    Object ref = name_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * name is the human-readable name of the member. If the member is not started, the name will be an empty string.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    Object ref = name_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PEERURLS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList peerURLs_;
  /**
   * <pre>
   * peerURLs is the list of URLs the member exposes to the cluster for communication.
   * </pre>
   *
   * <code>repeated string peerURLs = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getPeerURLsList() {
    return peerURLs_;
  }
  /**
   * <pre>
   * peerURLs is the list of URLs the member exposes to the cluster for communication.
   * </pre>
   *
   * <code>repeated string peerURLs = 3;</code>
   */
  public int getPeerURLsCount() {
    return peerURLs_.size();
  }
  /**
   * <pre>
   * peerURLs is the list of URLs the member exposes to the cluster for communication.
   * </pre>
   *
   * <code>repeated string peerURLs = 3;</code>
   */
  public String getPeerURLs(int index) {
    return peerURLs_.get(index);
  }
  /**
   * <pre>
   * peerURLs is the list of URLs the member exposes to the cluster for communication.
   * </pre>
   *
   * <code>repeated string peerURLs = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPeerURLsBytes(int index) {
    return peerURLs_.getByteString(index);
  }

  public static final int CLIENTURLS_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList clientURLs_;
  /**
   * <pre>
   * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
   * </pre>
   *
   * <code>repeated string clientURLs = 4;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getClientURLsList() {
    return clientURLs_;
  }
  /**
   * <pre>
   * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
   * </pre>
   *
   * <code>repeated string clientURLs = 4;</code>
   */
  public int getClientURLsCount() {
    return clientURLs_.size();
  }
  /**
   * <pre>
   * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
   * </pre>
   *
   * <code>repeated string clientURLs = 4;</code>
   */
  public String getClientURLs(int index) {
    return clientURLs_.get(index);
  }
  /**
   * <pre>
   * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
   * </pre>
   *
   * <code>repeated string clientURLs = 4;</code>
   */
  public com.google.protobuf.ByteString
      getClientURLsBytes(int index) {
    return clientURLs_.getByteString(index);
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
      output.writeUInt64(1, iD_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    for (int i = 0; i < peerURLs_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, peerURLs_.getRaw(i));
    }
    for (int i = 0; i < clientURLs_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, clientURLs_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (iD_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, iD_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < peerURLs_.size(); i++) {
        dataSize += computeStringSizeNoTag(peerURLs_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPeerURLsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < clientURLs_.size(); i++) {
        dataSize += computeStringSizeNoTag(clientURLs_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getClientURLsList().size();
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
    if (!(obj instanceof Member)) {
      return super.equals(obj);
    }
    Member other = (Member) obj;

    boolean result = true;
    result = result && (getID()
        == other.getID());
    result = result && getName()
        .equals(other.getName());
    result = result && getPeerURLsList()
        .equals(other.getPeerURLsList());
    result = result && getClientURLsList()
        .equals(other.getClientURLsList());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getPeerURLsCount() > 0) {
      hash = (37 * hash) + PEERURLS_FIELD_NUMBER;
      hash = (53 * hash) + getPeerURLsList().hashCode();
    }
    if (getClientURLsCount() > 0) {
      hash = (37 * hash) + CLIENTURLS_FIELD_NUMBER;
      hash = (53 * hash) + getClientURLsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Member parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Member parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Member parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Member parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Member parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Member parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Member parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Member parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Member parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Member parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Member parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Member parseFrom(
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
  public static Builder newBuilder(Member prototype) {
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
   * Protobuf type {@code etcdserverpb.Member}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.Member)
      com.coreos.jetcd.api.MemberOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return JetcdProto.internal_static_etcdserverpb_Member_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return JetcdProto.internal_static_etcdserverpb_Member_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Member.class, Builder.class);
    }

    // Construct using com.coreos.jetcd.api.Member.newBuilder()
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

      name_ = "";

      peerURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      clientURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return JetcdProto.internal_static_etcdserverpb_Member_descriptor;
    }

    public Member getDefaultInstanceForType() {
      return Member.getDefaultInstance();
    }

    public Member build() {
      Member result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public Member buildPartial() {
      Member result = new Member(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.iD_ = iD_;
      result.name_ = name_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        peerURLs_ = peerURLs_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.peerURLs_ = peerURLs_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        clientURLs_ = clientURLs_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.clientURLs_ = clientURLs_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof Member) {
        return mergeFrom((Member)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Member other) {
      if (other == Member.getDefaultInstance()) return this;
      if (other.getID() != 0L) {
        setID(other.getID());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.peerURLs_.isEmpty()) {
        if (peerURLs_.isEmpty()) {
          peerURLs_ = other.peerURLs_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensurePeerURLsIsMutable();
          peerURLs_.addAll(other.peerURLs_);
        }
        onChanged();
      }
      if (!other.clientURLs_.isEmpty()) {
        if (clientURLs_.isEmpty()) {
          clientURLs_ = other.clientURLs_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureClientURLsIsMutable();
          clientURLs_.addAll(other.clientURLs_);
        }
        onChanged();
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
      Member parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Member) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long iD_ ;
    /**
     * <pre>
     * ID is the member ID for this member.
     * </pre>
     *
     * <code>uint64 ID = 1;</code>
     */
    public long getID() {
      return iD_;
    }
    /**
     * <pre>
     * ID is the member ID for this member.
     * </pre>
     *
     * <code>uint64 ID = 1;</code>
     */
    public Builder setID(long value) {
      
      iD_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID is the member ID for this member.
     * </pre>
     *
     * <code>uint64 ID = 1;</code>
     */
    public Builder clearID() {
      
      iD_ = 0L;
      onChanged();
      return this;
    }

    private Object name_ = "";
    /**
     * <pre>
     * name is the human-readable name of the member. If the member is not started, the name will be an empty string.
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public String getName() {
      Object ref = name_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * name is the human-readable name of the member. If the member is not started, the name will be an empty string.
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * name is the human-readable name of the member. If the member is not started, the name will be an empty string.
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public Builder setName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name is the human-readable name of the member. If the member is not started, the name will be an empty string.
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name is the human-readable name of the member. If the member is not started, the name will be an empty string.
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList peerURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePeerURLsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        peerURLs_ = new com.google.protobuf.LazyStringArrayList(peerURLs_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * peerURLs is the list of URLs the member exposes to the cluster for communication.
     * </pre>
     *
     * <code>repeated string peerURLs = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getPeerURLsList() {
      return peerURLs_.getUnmodifiableView();
    }
    /**
     * <pre>
     * peerURLs is the list of URLs the member exposes to the cluster for communication.
     * </pre>
     *
     * <code>repeated string peerURLs = 3;</code>
     */
    public int getPeerURLsCount() {
      return peerURLs_.size();
    }
    /**
     * <pre>
     * peerURLs is the list of URLs the member exposes to the cluster for communication.
     * </pre>
     *
     * <code>repeated string peerURLs = 3;</code>
     */
    public String getPeerURLs(int index) {
      return peerURLs_.get(index);
    }
    /**
     * <pre>
     * peerURLs is the list of URLs the member exposes to the cluster for communication.
     * </pre>
     *
     * <code>repeated string peerURLs = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPeerURLsBytes(int index) {
      return peerURLs_.getByteString(index);
    }
    /**
     * <pre>
     * peerURLs is the list of URLs the member exposes to the cluster for communication.
     * </pre>
     *
     * <code>repeated string peerURLs = 3;</code>
     */
    public Builder setPeerURLs(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePeerURLsIsMutable();
      peerURLs_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * peerURLs is the list of URLs the member exposes to the cluster for communication.
     * </pre>
     *
     * <code>repeated string peerURLs = 3;</code>
     */
    public Builder addPeerURLs(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePeerURLsIsMutable();
      peerURLs_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * peerURLs is the list of URLs the member exposes to the cluster for communication.
     * </pre>
     *
     * <code>repeated string peerURLs = 3;</code>
     */
    public Builder addAllPeerURLs(
        Iterable<String> values) {
      ensurePeerURLsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, peerURLs_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * peerURLs is the list of URLs the member exposes to the cluster for communication.
     * </pre>
     *
     * <code>repeated string peerURLs = 3;</code>
     */
    public Builder clearPeerURLs() {
      peerURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * peerURLs is the list of URLs the member exposes to the cluster for communication.
     * </pre>
     *
     * <code>repeated string peerURLs = 3;</code>
     */
    public Builder addPeerURLsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePeerURLsIsMutable();
      peerURLs_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList clientURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureClientURLsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        clientURLs_ = new com.google.protobuf.LazyStringArrayList(clientURLs_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <pre>
     * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
     * </pre>
     *
     * <code>repeated string clientURLs = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getClientURLsList() {
      return clientURLs_.getUnmodifiableView();
    }
    /**
     * <pre>
     * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
     * </pre>
     *
     * <code>repeated string clientURLs = 4;</code>
     */
    public int getClientURLsCount() {
      return clientURLs_.size();
    }
    /**
     * <pre>
     * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
     * </pre>
     *
     * <code>repeated string clientURLs = 4;</code>
     */
    public String getClientURLs(int index) {
      return clientURLs_.get(index);
    }
    /**
     * <pre>
     * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
     * </pre>
     *
     * <code>repeated string clientURLs = 4;</code>
     */
    public com.google.protobuf.ByteString
        getClientURLsBytes(int index) {
      return clientURLs_.getByteString(index);
    }
    /**
     * <pre>
     * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
     * </pre>
     *
     * <code>repeated string clientURLs = 4;</code>
     */
    public Builder setClientURLs(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureClientURLsIsMutable();
      clientURLs_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
     * </pre>
     *
     * <code>repeated string clientURLs = 4;</code>
     */
    public Builder addClientURLs(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureClientURLsIsMutable();
      clientURLs_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
     * </pre>
     *
     * <code>repeated string clientURLs = 4;</code>
     */
    public Builder addAllClientURLs(
        Iterable<String> values) {
      ensureClientURLsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, clientURLs_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
     * </pre>
     *
     * <code>repeated string clientURLs = 4;</code>
     */
    public Builder clearClientURLs() {
      clientURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
     * </pre>
     *
     * <code>repeated string clientURLs = 4;</code>
     */
    public Builder addClientURLsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureClientURLsIsMutable();
      clientURLs_.add(value);
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


    // @@protoc_insertion_point(builder_scope:etcdserverpb.Member)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.Member)
  private static final Member DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Member();
  }

  public static Member getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Member>
      PARSER = new com.google.protobuf.AbstractParser<Member>() {
    public Member parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Member(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Member> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Member> getParserForType() {
    return PARSER;
  }

  public Member getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

