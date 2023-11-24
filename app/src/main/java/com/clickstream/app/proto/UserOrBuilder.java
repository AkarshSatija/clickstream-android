// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User.proto

package com.clickstream.app.proto;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clickstream.proto.User)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Unique identy of the user.
   * </pre>
   *
   * <code>string guid = 1;</code>
   * @return The guid.
   */
  String getGuid();
  /**
   * <pre>
   * Unique identy of the user.
   * </pre>
   *
   * <code>string guid = 1;</code>
   * @return The bytes for guid.
   */
  com.google.protobuf.ByteString
      getGuidBytes();

  /**
   * <pre>
   * User's full name.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  String getName();
  /**
   * <pre>
   * User's full name.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * User's age.
   * </pre>
   *
   * <code>int32 age = 3;</code>
   * @return The age.
   */
  int getAge();

  /**
   * <pre>
   * User's gender.
   * </pre>
   *
   * <code>string gender = 4;</code>
   * @return The gender.
   */
  String getGender();
  /**
   * <pre>
   * User's gender.
   * </pre>
   *
   * <code>string gender = 4;</code>
   * @return The bytes for gender.
   */
  com.google.protobuf.ByteString
      getGenderBytes();

  /**
   * <pre>
   * User's phone number.
   * </pre>
   *
   * <code>int64 phone_number = 5;</code>
   * @return The phoneNumber.
   */
  long getPhoneNumber();

  /**
   * <pre>
   * User's email address.
   * </pre>
   *
   * <code>string email = 6;</code>
   * @return The email.
   */
  String getEmail();
  /**
   * <pre>
   * User's email address.
   * </pre>
   *
   * <code>string email = 6;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * User's app details.
   * </pre>
   *
   * <code>.clickstream.proto.App app = 7;</code>
   * @return Whether the app field is set.
   */
  boolean hasApp();
  /**
   * <pre>
   * User's app details.
   * </pre>
   *
   * <code>.clickstream.proto.App app = 7;</code>
   * @return The app.
   */
  App getApp();

  /**
   * <pre>
   * User's device details.
   * </pre>
   *
   * <code>.clickstream.proto.Device device = 8;</code>
   * @return Whether the device field is set.
   */
  boolean hasDevice();
  /**
   * <pre>
   * User's device details.
   * </pre>
   *
   * <code>.clickstream.proto.Device device = 8;</code>
   * @return The device.
   */
  Device getDevice();

  /**
   * <pre>
   * Timestamp for the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp device_timestamp = 9;</code>
   * @return Whether the deviceTimestamp field is set.
   */
  boolean hasDeviceTimestamp();
  /**
   * <pre>
   * Timestamp for the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp device_timestamp = 9;</code>
   * @return The deviceTimestamp.
   */
  com.google.protobuf.Timestamp getDeviceTimestamp();
}
