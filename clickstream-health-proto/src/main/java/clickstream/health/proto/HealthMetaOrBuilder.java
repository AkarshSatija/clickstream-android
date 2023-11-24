// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HealthMeta.proto

package clickstream.health.proto;

public interface HealthMetaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clickstream.health.proto.HealthMeta)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string event_guid = 1;</code>
   * @return The eventGuid.
   */
  String getEventGuid();
  /**
   * <code>string event_guid = 1;</code>
   * @return The bytes for eventGuid.
   */
  com.google.protobuf.ByteString
      getEventGuidBytes();

  /**
   * <code>.clickstream.health.proto.HealthMeta.Location location = 4;</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <code>.clickstream.health.proto.HealthMeta.Location location = 4;</code>
   * @return The location.
   */
  HealthMeta.Location getLocation();

  /**
   * <code>.clickstream.health.proto.HealthMeta.Customer customer = 5;</code>
   * @return Whether the customer field is set.
   */
  boolean hasCustomer();
  /**
   * <code>.clickstream.health.proto.HealthMeta.Customer customer = 5;</code>
   * @return The customer.
   */
  HealthMeta.Customer getCustomer();

  /**
   * <code>.clickstream.health.proto.HealthMeta.Device device = 6;</code>
   * @return Whether the device field is set.
   */
  boolean hasDevice();
  /**
   * <code>.clickstream.health.proto.HealthMeta.Device device = 6;</code>
   * @return The device.
   */
  HealthMeta.Device getDevice();

  /**
   * <code>.clickstream.health.proto.HealthMeta.Session session = 7;</code>
   * @return Whether the session field is set.
   */
  boolean hasSession();
  /**
   * <code>.clickstream.health.proto.HealthMeta.Session session = 7;</code>
   * @return The session.
   */
  HealthMeta.Session getSession();

  /**
   * <code>.clickstream.health.proto.HealthMeta.App app = 8;</code>
   * @return Whether the app field is set.
   */
  boolean hasApp();
  /**
   * <code>.clickstream.health.proto.HealthMeta.App app = 8;</code>
   * @return The app.
   */
  HealthMeta.App getApp();
}