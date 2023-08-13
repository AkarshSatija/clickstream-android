// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Health.proto

package clickstream.health.proto;

/**
 * Protobuf type {@code clickstream.health.proto.Health}
 */
public  final class Health extends
    com.google.protobuf.GeneratedMessageLite<
        Health, Health.Builder> implements
    // @@protoc_insertion_point(message_implements:clickstream.health.proto.Health)
    HealthOrBuilder {
  private Health() {
    eventName_ = "";
  }
  public static final int EVENT_NAME_FIELD_NUMBER = 1;
  private String eventName_;
  /**
   * <pre>
   * Name of the health event.
   * </pre>
   *
   * <code>string event_name = 1;</code>
   * @return The eventName.
   */
  @Override
  public String getEventName() {
    return eventName_;
  }
  /**
   * <pre>
   * Name of the health event.
   * </pre>
   *
   * <code>string event_name = 1;</code>
   * @return The bytes for eventName.
   */
  @Override
  public com.google.protobuf.ByteString
      getEventNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(eventName_);
  }
  /**
   * <pre>
   * Name of the health event.
   * </pre>
   *
   * <code>string event_name = 1;</code>
   * @param value The eventName to set.
   */
  private void setEventName(
      String value) {
    Class<?> valueClass = value.getClass();
  
    eventName_ = value;
  }
  /**
   * <pre>
   * Name of the health event.
   * </pre>
   *
   * <code>string event_name = 1;</code>
   */
  private void clearEventName() {
    
    eventName_ = getDefaultInstance().getEventName();
  }
  /**
   * <pre>
   * Name of the health event.
   * </pre>
   *
   * <code>string event_name = 1;</code>
   * @param value The bytes for eventName to set.
   */
  private void setEventNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    eventName_ = value.toStringUtf8();
    
  }

  public static final int HEALTHDETAILS_FIELD_NUMBER = 2;
  private HealthDetails healthDetails_;
  /**
   * <pre>
   * Health details, captured by the SDK when the mode is verbose.
   * </pre>
   *
   * <code>.clickstream.health.proto.HealthDetails healthDetails = 2;</code>
   */
  @Override
  public boolean hasHealthDetails() {
    return healthDetails_ != null;
  }
  /**
   * <pre>
   * Health details, captured by the SDK when the mode is verbose.
   * </pre>
   *
   * <code>.clickstream.health.proto.HealthDetails healthDetails = 2;</code>
   */
  @Override
  public HealthDetails getHealthDetails() {
    return healthDetails_ == null ? HealthDetails.getDefaultInstance() : healthDetails_;
  }
  /**
   * <pre>
   * Health details, captured by the SDK when the mode is verbose.
   * </pre>
   *
   * <code>.clickstream.health.proto.HealthDetails healthDetails = 2;</code>
   */
  private void setHealthDetails(HealthDetails value) {
    value.getClass();
  healthDetails_ = value;
    
    }
  /**
   * <pre>
   * Health details, captured by the SDK when the mode is verbose.
   * </pre>
   *
   * <code>.clickstream.health.proto.HealthDetails healthDetails = 2;</code>
   */
  @SuppressWarnings({"ReferenceEquality"})
  private void mergeHealthDetails(HealthDetails value) {
    value.getClass();
  if (healthDetails_ != null &&
        healthDetails_ != HealthDetails.getDefaultInstance()) {
      healthDetails_ =
        HealthDetails.newBuilder(healthDetails_).mergeFrom(value).buildPartial();
    } else {
      healthDetails_ = value;
    }
    
  }
  /**
   * <pre>
   * Health details, captured by the SDK when the mode is verbose.
   * </pre>
   *
   * <code>.clickstream.health.proto.HealthDetails healthDetails = 2;</code>
   */
  private void clearHealthDetails() {  healthDetails_ = null;
    
  }

  public static final int NUMBER_OF_EVENTS_FIELD_NUMBER = 3;
  private long numberOfEvents_;
  /**
   * <pre>
   * Number of events tracked.
   * </pre>
   *
   * <code>int64 number_of_events = 3;</code>
   * @return The numberOfEvents.
   */
  @Override
  public long getNumberOfEvents() {
    return numberOfEvents_;
  }
  /**
   * <pre>
   * Number of events tracked.
   * </pre>
   *
   * <code>int64 number_of_events = 3;</code>
   * @param value The numberOfEvents to set.
   */
  private void setNumberOfEvents(long value) {
    
    numberOfEvents_ = value;
  }
  /**
   * <pre>
   * Number of events tracked.
   * </pre>
   *
   * <code>int64 number_of_events = 3;</code>
   */
  private void clearNumberOfEvents() {
    
    numberOfEvents_ = 0L;
  }

  public static final int NUMBER_OF_BATCHES_FIELD_NUMBER = 4;
  private long numberOfBatches_;
  /**
   * <pre>
   * Number of event batches tracked.
   * </pre>
   *
   * <code>int64 number_of_batches = 4;</code>
   * @return The numberOfBatches.
   */
  @Override
  public long getNumberOfBatches() {
    return numberOfBatches_;
  }
  /**
   * <pre>
   * Number of event batches tracked.
   * </pre>
   *
   * <code>int64 number_of_batches = 4;</code>
   * @param value The numberOfBatches to set.
   */
  private void setNumberOfBatches(long value) {
    
    numberOfBatches_ = value;
  }
  /**
   * <pre>
   * Number of event batches tracked.
   * </pre>
   *
   * <code>int64 number_of_batches = 4;</code>
   */
  private void clearNumberOfBatches() {
    
    numberOfBatches_ = 0L;
  }

  public static final int EVENT_TIMESTAMP_FIELD_NUMBER = 101;
  private com.google.protobuf.Timestamp eventTimestamp_;
  /**
   * <pre>
   * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_timestamp = 101;</code>
   */
  @Override
  public boolean hasEventTimestamp() {
    return eventTimestamp_ != null;
  }
  /**
   * <pre>
   * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_timestamp = 101;</code>
   */
  @Override
  public com.google.protobuf.Timestamp getEventTimestamp() {
    return eventTimestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : eventTimestamp_;
  }
  /**
   * <pre>
   * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_timestamp = 101;</code>
   */
  private void setEventTimestamp(com.google.protobuf.Timestamp value) {
    value.getClass();
  eventTimestamp_ = value;
    
    }
  /**
   * <pre>
   * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_timestamp = 101;</code>
   */
  @SuppressWarnings({"ReferenceEquality"})
  private void mergeEventTimestamp(com.google.protobuf.Timestamp value) {
    value.getClass();
  if (eventTimestamp_ != null &&
        eventTimestamp_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
      eventTimestamp_ =
        com.google.protobuf.Timestamp.newBuilder(eventTimestamp_).mergeFrom(value).buildPartial();
    } else {
      eventTimestamp_ = value;
    }
    
  }
  /**
   * <pre>
   * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_timestamp = 101;</code>
   */
  private void clearEventTimestamp() {  eventTimestamp_ = null;
    
  }

  public static final int HEALTHMETA_FIELD_NUMBER = 103;
  private HealthMeta healthMeta_;
  /**
   * <code>.clickstream.health.proto.HealthMeta healthMeta = 103;</code>
   */
  @Override
  public boolean hasHealthMeta() {
    return healthMeta_ != null;
  }
  /**
   * <code>.clickstream.health.proto.HealthMeta healthMeta = 103;</code>
   */
  @Override
  public HealthMeta getHealthMeta() {
    return healthMeta_ == null ? HealthMeta.getDefaultInstance() : healthMeta_;
  }
  /**
   * <code>.clickstream.health.proto.HealthMeta healthMeta = 103;</code>
   */
  private void setHealthMeta(HealthMeta value) {
    value.getClass();
  healthMeta_ = value;
    
    }
  /**
   * <code>.clickstream.health.proto.HealthMeta healthMeta = 103;</code>
   */
  @SuppressWarnings({"ReferenceEquality"})
  private void mergeHealthMeta(HealthMeta value) {
    value.getClass();
  if (healthMeta_ != null &&
        healthMeta_ != HealthMeta.getDefaultInstance()) {
      healthMeta_ =
        HealthMeta.newBuilder(healthMeta_).mergeFrom(value).buildPartial();
    } else {
      healthMeta_ = value;
    }
    
  }
  /**
   * <code>.clickstream.health.proto.HealthMeta healthMeta = 103;</code>
   */
  private void clearHealthMeta() {  healthMeta_ = null;
    
  }

  public static final int DEVICE_TIMESTAMP_FIELD_NUMBER = 104;
  private com.google.protobuf.Timestamp deviceTimestamp_;
  /**
   * <pre>
   * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp device_timestamp = 104;</code>
   */
  @Override
  public boolean hasDeviceTimestamp() {
    return deviceTimestamp_ != null;
  }
  /**
   * <pre>
   * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp device_timestamp = 104;</code>
   */
  @Override
  public com.google.protobuf.Timestamp getDeviceTimestamp() {
    return deviceTimestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : deviceTimestamp_;
  }
  /**
   * <pre>
   * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp device_timestamp = 104;</code>
   */
  private void setDeviceTimestamp(com.google.protobuf.Timestamp value) {
    value.getClass();
  deviceTimestamp_ = value;
    
    }
  /**
   * <pre>
   * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp device_timestamp = 104;</code>
   */
  @SuppressWarnings({"ReferenceEquality"})
  private void mergeDeviceTimestamp(com.google.protobuf.Timestamp value) {
    value.getClass();
  if (deviceTimestamp_ != null &&
        deviceTimestamp_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
      deviceTimestamp_ =
        com.google.protobuf.Timestamp.newBuilder(deviceTimestamp_).mergeFrom(value).buildPartial();
    } else {
      deviceTimestamp_ = value;
    }
    
  }
  /**
   * <pre>
   * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp device_timestamp = 104;</code>
   */
  private void clearDeviceTimestamp() {  deviceTimestamp_ = null;
    
  }

  public static Health parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static Health parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static Health parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static Health parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static Health parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static Health parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static Health parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static Health parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static Health parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static Health parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static Health parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static Health parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(Health prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code clickstream.health.proto.Health}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        Health, Builder> implements
      // @@protoc_insertion_point(builder_implements:clickstream.health.proto.Health)
      HealthOrBuilder {
    // Construct using clickstream.health.proto.Health.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Name of the health event.
     * </pre>
     *
     * <code>string event_name = 1;</code>
     * @return The eventName.
     */
    @Override
    public String getEventName() {
      return instance.getEventName();
    }
    /**
     * <pre>
     * Name of the health event.
     * </pre>
     *
     * <code>string event_name = 1;</code>
     * @return The bytes for eventName.
     */
    @Override
    public com.google.protobuf.ByteString
        getEventNameBytes() {
      return instance.getEventNameBytes();
    }
    /**
     * <pre>
     * Name of the health event.
     * </pre>
     *
     * <code>string event_name = 1;</code>
     * @param value The eventName to set.
     * @return This builder for chaining.
     */
    public Builder setEventName(
        String value) {
      copyOnWrite();
      instance.setEventName(value);
      return this;
    }
    /**
     * <pre>
     * Name of the health event.
     * </pre>
     *
     * <code>string event_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventName() {
      copyOnWrite();
      instance.clearEventName();
      return this;
    }
    /**
     * <pre>
     * Name of the health event.
     * </pre>
     *
     * <code>string event_name = 1;</code>
     * @param value The bytes for eventName to set.
     * @return This builder for chaining.
     */
    public Builder setEventNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setEventNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * Health details, captured by the SDK when the mode is verbose.
     * </pre>
     *
     * <code>.clickstream.health.proto.HealthDetails healthDetails = 2;</code>
     */
    @Override
    public boolean hasHealthDetails() {
      return instance.hasHealthDetails();
    }
    /**
     * <pre>
     * Health details, captured by the SDK when the mode is verbose.
     * </pre>
     *
     * <code>.clickstream.health.proto.HealthDetails healthDetails = 2;</code>
     */
    @Override
    public HealthDetails getHealthDetails() {
      return instance.getHealthDetails();
    }
    /**
     * <pre>
     * Health details, captured by the SDK when the mode is verbose.
     * </pre>
     *
     * <code>.clickstream.health.proto.HealthDetails healthDetails = 2;</code>
     */
    public Builder setHealthDetails(HealthDetails value) {
      copyOnWrite();
      instance.setHealthDetails(value);
      return this;
      }
    /**
     * <pre>
     * Health details, captured by the SDK when the mode is verbose.
     * </pre>
     *
     * <code>.clickstream.health.proto.HealthDetails healthDetails = 2;</code>
     */
    public Builder setHealthDetails(
        HealthDetails.Builder builderForValue) {
      copyOnWrite();
      instance.setHealthDetails(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Health details, captured by the SDK when the mode is verbose.
     * </pre>
     *
     * <code>.clickstream.health.proto.HealthDetails healthDetails = 2;</code>
     */
    public Builder mergeHealthDetails(HealthDetails value) {
      copyOnWrite();
      instance.mergeHealthDetails(value);
      return this;
    }
    /**
     * <pre>
     * Health details, captured by the SDK when the mode is verbose.
     * </pre>
     *
     * <code>.clickstream.health.proto.HealthDetails healthDetails = 2;</code>
     */
    public Builder clearHealthDetails() {  copyOnWrite();
      instance.clearHealthDetails();
      return this;
    }

    /**
     * <pre>
     * Number of events tracked.
     * </pre>
     *
     * <code>int64 number_of_events = 3;</code>
     * @return The numberOfEvents.
     */
    @Override
    public long getNumberOfEvents() {
      return instance.getNumberOfEvents();
    }
    /**
     * <pre>
     * Number of events tracked.
     * </pre>
     *
     * <code>int64 number_of_events = 3;</code>
     * @param value The numberOfEvents to set.
     * @return This builder for chaining.
     */
    public Builder setNumberOfEvents(long value) {
      copyOnWrite();
      instance.setNumberOfEvents(value);
      return this;
    }
    /**
     * <pre>
     * Number of events tracked.
     * </pre>
     *
     * <code>int64 number_of_events = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumberOfEvents() {
      copyOnWrite();
      instance.clearNumberOfEvents();
      return this;
    }

    /**
     * <pre>
     * Number of event batches tracked.
     * </pre>
     *
     * <code>int64 number_of_batches = 4;</code>
     * @return The numberOfBatches.
     */
    @Override
    public long getNumberOfBatches() {
      return instance.getNumberOfBatches();
    }
    /**
     * <pre>
     * Number of event batches tracked.
     * </pre>
     *
     * <code>int64 number_of_batches = 4;</code>
     * @param value The numberOfBatches to set.
     * @return This builder for chaining.
     */
    public Builder setNumberOfBatches(long value) {
      copyOnWrite();
      instance.setNumberOfBatches(value);
      return this;
    }
    /**
     * <pre>
     * Number of event batches tracked.
     * </pre>
     *
     * <code>int64 number_of_batches = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumberOfBatches() {
      copyOnWrite();
      instance.clearNumberOfBatches();
      return this;
    }

    /**
     * <pre>
     * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_timestamp = 101;</code>
     */
    @Override
    public boolean hasEventTimestamp() {
      return instance.hasEventTimestamp();
    }
    /**
     * <pre>
     * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_timestamp = 101;</code>
     */
    @Override
    public com.google.protobuf.Timestamp getEventTimestamp() {
      return instance.getEventTimestamp();
    }
    /**
     * <pre>
     * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_timestamp = 101;</code>
     */
    public Builder setEventTimestamp(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.setEventTimestamp(value);
      return this;
      }
    /**
     * <pre>
     * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_timestamp = 101;</code>
     */
    public Builder setEventTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      copyOnWrite();
      instance.setEventTimestamp(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_timestamp = 101;</code>
     */
    public Builder mergeEventTimestamp(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.mergeEventTimestamp(value);
      return this;
    }
    /**
     * <pre>
     * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_timestamp = 101;</code>
     */
    public Builder clearEventTimestamp() {  copyOnWrite();
      instance.clearEventTimestamp();
      return this;
    }

    /**
     * <code>.clickstream.health.proto.HealthMeta healthMeta = 103;</code>
     */
    @Override
    public boolean hasHealthMeta() {
      return instance.hasHealthMeta();
    }
    /**
     * <code>.clickstream.health.proto.HealthMeta healthMeta = 103;</code>
     */
    @Override
    public HealthMeta getHealthMeta() {
      return instance.getHealthMeta();
    }
    /**
     * <code>.clickstream.health.proto.HealthMeta healthMeta = 103;</code>
     */
    public Builder setHealthMeta(HealthMeta value) {
      copyOnWrite();
      instance.setHealthMeta(value);
      return this;
      }
    /**
     * <code>.clickstream.health.proto.HealthMeta healthMeta = 103;</code>
     */
    public Builder setHealthMeta(
        HealthMeta.Builder builderForValue) {
      copyOnWrite();
      instance.setHealthMeta(builderForValue.build());
      return this;
    }
    /**
     * <code>.clickstream.health.proto.HealthMeta healthMeta = 103;</code>
     */
    public Builder mergeHealthMeta(HealthMeta value) {
      copyOnWrite();
      instance.mergeHealthMeta(value);
      return this;
    }
    /**
     * <code>.clickstream.health.proto.HealthMeta healthMeta = 103;</code>
     */
    public Builder clearHealthMeta() {  copyOnWrite();
      instance.clearHealthMeta();
      return this;
    }

    /**
     * <pre>
     * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp device_timestamp = 104;</code>
     */
    @Override
    public boolean hasDeviceTimestamp() {
      return instance.hasDeviceTimestamp();
    }
    /**
     * <pre>
     * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp device_timestamp = 104;</code>
     */
    @Override
    public com.google.protobuf.Timestamp getDeviceTimestamp() {
      return instance.getDeviceTimestamp();
    }
    /**
     * <pre>
     * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp device_timestamp = 104;</code>
     */
    public Builder setDeviceTimestamp(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.setDeviceTimestamp(value);
      return this;
      }
    /**
     * <pre>
     * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp device_timestamp = 104;</code>
     */
    public Builder setDeviceTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      copyOnWrite();
      instance.setDeviceTimestamp(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp device_timestamp = 104;</code>
     */
    public Builder mergeDeviceTimestamp(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.mergeDeviceTimestamp(value);
      return this;
    }
    /**
     * <pre>
     * Note: Auto-filled by the ClickStream SDK, need not be set by the products for every event! If set, will be overridden.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp device_timestamp = 104;</code>
     */
    public Builder clearDeviceTimestamp() {  copyOnWrite();
      instance.clearDeviceTimestamp();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:clickstream.health.proto.Health)
  }
  @Override
  @SuppressWarnings({"unchecked", "fallthrough"})
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new Health();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          Object[] objects = new Object[] {
            "eventName_",
            "healthDetails_",
            "numberOfEvents_",
            "numberOfBatches_",
            "eventTimestamp_",
            "healthMeta_",
            "deviceTimestamp_",
          };
          String info =
              "\u0000\u0007\u0000\u0000\u0001h\u0007\u0000\u0000\u0000\u0001\u0208\u0002\t\u0003" +
              "\u0002\u0004\u0002e\tg\th\t";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<Health> parser = PARSER;
        if (parser == null) {
          synchronized (Health.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<Health>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:clickstream.health.proto.Health)
  private static final Health DEFAULT_INSTANCE;
  static {
    Health defaultInstance = new Health();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Health.class, defaultInstance);
  }

  public static Health getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Health> PARSER;

  public static com.google.protobuf.Parser<Health> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

