// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raccoon.proto

package clickstream.internal.networklayer.proto.raccoon;

public interface SendEventResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:raystack.raccoon.v1beta1.SendEventResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   *`status` denotes status of the request.
   *Only 3 values are valid. `SUCCESS` means the the request is processed
   *successfully. `ERROR` means the request failed to be processed. `UNKNOWN_STATUS`
   *means Raccoon unable to determine whether the request is success or not.
   * </pre>
   *
   * <code>.raystack.raccoon.v1beta1.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   *`status` denotes status of the request.
   *Only 3 values are valid. `SUCCESS` means the the request is processed
   *successfully. `ERROR` means the request failed to be processed. `UNKNOWN_STATUS`
   *means Raccoon unable to determine whether the request is success or not.
   * </pre>
   *
   * <code>.raystack.raccoon.v1beta1.Status status = 1;</code>
   * @return The status.
   */
  Status getStatus();

  /**
   * <pre>
   *`code` gives more detail of what happened to the request.
   *Details of available `code` can be seen below.
   * </pre>
   *
   * <code>.raystack.raccoon.v1beta1.Code code = 2;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <pre>
   *`code` gives more detail of what happened to the request.
   *Details of available `code` can be seen below.
   * </pre>
   *
   * <code>.raystack.raccoon.v1beta1.Code code = 2;</code>
   * @return The code.
   */
  Code getCode();

  /**
   * <pre>
   *`sent_time` is UNIX timestamp populated by Raccoon by the time the response is sent.
   * </pre>
   *
   * <code>int64 sent_time = 3;</code>
   * @return The sentTime.
   */
  long getSentTime();

  /**
   * <pre>
   *`reason` is additional-human readable information to provide more context to `status` and `code`.
   *There is no predefined structure for this. The value is arbitrary.
   * </pre>
   *
   * <code>string reason = 4;</code>
   * @return The reason.
   */
  String getReason();
  /**
   * <pre>
   *`reason` is additional-human readable information to provide more context to `status` and `code`.
   *There is no predefined structure for this. The value is arbitrary.
   * </pre>
   *
   * <code>string reason = 4;</code>
   * @return The bytes for reason.
   */
  com.google.protobuf.ByteString
      getReasonBytes();

  /**
   * <pre>
   *`data` is arbitrary extra metadata.
   *Arbitrary key-value makes the field flexible for future changes. `req_guid` is also sent as part
   *of `data`. The client may fetch req_guid as key to get the `req_guid` value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; data = 5;</code>
   */
  int getDataCount();
  /**
   * <pre>
   *`data` is arbitrary extra metadata.
   *Arbitrary key-value makes the field flexible for future changes. `req_guid` is also sent as part
   *of `data`. The client may fetch req_guid as key to get the `req_guid` value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; data = 5;</code>
   */
  boolean containsData(
      String key);
  /**
   * Use {@link #getDataMap()} instead.
   */
  @Deprecated
  java.util.Map<String, String>
  getData();
  /**
   * <pre>
   *`data` is arbitrary extra metadata.
   *Arbitrary key-value makes the field flexible for future changes. `req_guid` is also sent as part
   *of `data`. The client may fetch req_guid as key to get the `req_guid` value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; data = 5;</code>
   */
  java.util.Map<String, String>
  getDataMap();
  /**
   * <pre>
   *`data` is arbitrary extra metadata.
   *Arbitrary key-value makes the field flexible for future changes. `req_guid` is also sent as part
   *of `data`. The client may fetch req_guid as key to get the `req_guid` value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; data = 5;</code>
   */

  String getDataOrDefault(
      String key,
      String defaultValue);
  /**
   * <pre>
   *`data` is arbitrary extra metadata.
   *Arbitrary key-value makes the field flexible for future changes. `req_guid` is also sent as part
   *of `data`. The client may fetch req_guid as key to get the `req_guid` value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; data = 5;</code>
   */

  String getDataOrThrow(
      String key);
}