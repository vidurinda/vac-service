// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Greeting.proto

package com.ices.vac;

/**
 * Protobuf type {@code com.ices.vac.GreetingResponse}
 */
public final class GreetingResponse extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:com.ices.vac.GreetingResponse)
        GreetingResponseOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use GreetingResponse.newBuilder() to construct.
    private GreetingResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private GreetingResponse() {
        result_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
        return new GreetingResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    private GreetingResponse(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
        }
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    case 10: {
                        java.lang.String s = input.readStringRequireUtf8();

                        result_ = s;
                        break;
                    }
                    default: {
                        if (!parseUnknownField(
                                input, unknownFields, extensionRegistry, tag)) {
                            done = true;
                        }
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
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return com.ices.vac.GreetingOuterClass.internal_static_com_ices_vac_GreetingResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return com.ices.vac.GreetingOuterClass.internal_static_com_ices_vac_GreetingResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        com.ices.vac.GreetingResponse.class, com.ices.vac.GreetingResponse.Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private volatile java.lang.Object result_;

    /**
     * <code>string result = 1;</code>
     *
     * @return The result.
     */
    @java.lang.Override
    public java.lang.String getResult() {
        java.lang.Object ref = result_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            result_ = s;
            return s;
        }
    }

    /**
     * <code>string result = 1;</code>
     *
     * @return The bytes for result.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getResultBytes() {
        java.lang.Object ref = result_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            result_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (!getResultBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, result_);
        }
        unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getResultBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, result_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.ices.vac.GreetingResponse)) {
            return super.equals(obj);
        }
        com.ices.vac.GreetingResponse other = (com.ices.vac.GreetingResponse) obj;

        if (!getResult()
                .equals(other.getResult())) return false;
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + RESULT_FIELD_NUMBER;
        hash = (53 * hash) + getResult().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static com.ices.vac.GreetingResponse parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.ices.vac.GreetingResponse parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.ices.vac.GreetingResponse parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.ices.vac.GreetingResponse parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.ices.vac.GreetingResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.ices.vac.GreetingResponse parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.ices.vac.GreetingResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static com.ices.vac.GreetingResponse parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.ices.vac.GreetingResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.ices.vac.GreetingResponse parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.ices.vac.GreetingResponse parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static com.ices.vac.GreetingResponse parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.ices.vac.GreetingResponse prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
                ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * Protobuf type {@code com.ices.vac.GreetingResponse}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:com.ices.vac.GreetingResponse)
            com.ices.vac.GreetingResponseOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.ices.vac.GreetingOuterClass.internal_static_com_ices_vac_GreetingResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.ices.vac.GreetingOuterClass.internal_static_com_ices_vac_GreetingResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.ices.vac.GreetingResponse.class, com.ices.vac.GreetingResponse.Builder.class);
        }

        // Construct using com.ices.vac.GreetingResponse.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                    .alwaysUseFieldBuilders) {
            }
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            result_ = "";

            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return com.ices.vac.GreetingOuterClass.internal_static_com_ices_vac_GreetingResponse_descriptor;
        }

        @java.lang.Override
        public com.ices.vac.GreetingResponse getDefaultInstanceForType() {
            return com.ices.vac.GreetingResponse.getDefaultInstance();
        }

        @java.lang.Override
        public com.ices.vac.GreetingResponse build() {
            com.ices.vac.GreetingResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public com.ices.vac.GreetingResponse buildPartial() {
            com.ices.vac.GreetingResponse result = new com.ices.vac.GreetingResponse(this);
            result.result_ = result_;
            onBuilt();
            return result;
        }

        @java.lang.Override
        public Builder clone() {
            return super.clone();
        }

        @java.lang.Override
        public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
            return super.setField(field, value);
        }

        @java.lang.Override
        public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
            return super.clearField(field);
        }

        @java.lang.Override
        public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return super.clearOneof(oneof);
        }

        @java.lang.Override
        public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, java.lang.Object value) {
            return super.setRepeatedField(field, index, value);
        }

        @java.lang.Override
        public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
            return super.addRepeatedField(field, value);
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof com.ices.vac.GreetingResponse) {
                return mergeFrom((com.ices.vac.GreetingResponse) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.ices.vac.GreetingResponse other) {
            if (other == com.ices.vac.GreetingResponse.getDefaultInstance()) return this;
            if (!other.getResult().isEmpty()) {
                result_ = other.result_;
                onChanged();
            }
            this.mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
            return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            com.ices.vac.GreetingResponse parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (com.ices.vac.GreetingResponse) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private java.lang.Object result_ = "";

        /**
         * <code>string result = 1;</code>
         *
         * @return The result.
         */
        public java.lang.String getResult() {
            java.lang.Object ref = result_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                result_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string result = 1;</code>
         *
         * @return The bytes for result.
         */
        public com.google.protobuf.ByteString
        getResultBytes() {
            java.lang.Object ref = result_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                result_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string result = 1;</code>
         *
         * @param value The result to set.
         * @return This builder for chaining.
         */
        public Builder setResult(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            result_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string result = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearResult() {

            result_ = getDefaultInstance().getResult();
            onChanged();
            return this;
        }

        /**
         * <code>string result = 1;</code>
         *
         * @param value The bytes for result to set.
         * @return This builder for chaining.
         */
        public Builder setResultBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            result_ = value;
            onChanged();
            return this;
        }

        @java.lang.Override
        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:com.ices.vac.GreetingResponse)
    }

    // @@protoc_insertion_point(class_scope:com.ices.vac.GreetingResponse)
    private static final com.ices.vac.GreetingResponse DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new com.ices.vac.GreetingResponse();
    }

    public static com.ices.vac.GreetingResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GreetingResponse>
            PARSER = new com.google.protobuf.AbstractParser<GreetingResponse>() {
        @java.lang.Override
        public GreetingResponse parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new GreetingResponse(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<GreetingResponse> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GreetingResponse> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public com.ices.vac.GreetingResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

