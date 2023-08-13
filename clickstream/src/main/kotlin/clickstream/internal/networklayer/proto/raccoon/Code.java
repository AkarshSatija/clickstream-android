// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raccoon.proto

package clickstream.internal.networklayer.proto.raccoon;

/**
 * Protobuf enum {@code raystack.raccoon.v1beta1.Code}
 */
public enum Code
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <pre>
   *`CODE_UNSPECIFIED` indicates no appropriate/existing code can describe it.
   * </pre>
   *
   * <code>CODE_UNSPECIFIED = 0;</code>
   */
  CODE_UNSPECIFIED(0),
  /**
   * <pre>
   *`OK` indicates the request is processed successfully.
   * </pre>
   *
   * <code>CODE_OK = 1;</code>
   */
  CODE_OK(1),
  /**
   * <pre>
   *`BAD_REQUEST` indicates there is something wrong with the request.
   * </pre>
   *
   * <code>CODE_BAD_REQUEST = 2;</code>
   */
  CODE_BAD_REQUEST(2),
  /**
   * <pre>
   *`INTERNAL_ERROR` indicates that Raccoon encountered an unexpected condition that prevented it from fulfilling the request.
   * </pre>
   *
   * <code>CODE_INTERNAL_ERROR = 3;</code>
   */
  CODE_INTERNAL_ERROR(3),
  /**
   * <pre>
   *`MAX_CONNECTION_LIMIT_REACHED` indicates that Raccoon is unable to accepts new connection due to max connection is reached.
   *To prevent Raccoon from eating up resources, connection limit needs to be set. The limit is configurable on Raccoon by setting `SERVER_WEBSOCKET_MAX_CONN`
   * </pre>
   *
   * <code>CODE_MAX_CONNECTION_LIMIT_REACHED = 4;</code>
   */
  CODE_MAX_CONNECTION_LIMIT_REACHED(4),
  /**
   * <pre>
   *`MAX_USER_LIMIT_REACHED` indicates that existing connection with the same ID.
   *Raccoon ensures unique connection using unique identifier passed from the header
   *the first time Websocket connection is established. The header key that
   *contains unique identifier is configurable on Raccoon by setting `SERVER_WEBSOCKET_CONN_UNIQ_ID_HEADER`
   * </pre>
   *
   * <code>CODE_MAX_USER_LIMIT_REACHED = 5;</code>
   */
  CODE_MAX_USER_LIMIT_REACHED(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *`CODE_UNSPECIFIED` indicates no appropriate/existing code can describe it.
   * </pre>
   *
   * <code>CODE_UNSPECIFIED = 0;</code>
   */
  public static final int CODE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   *`OK` indicates the request is processed successfully.
   * </pre>
   *
   * <code>CODE_OK = 1;</code>
   */
  public static final int CODE_OK_VALUE = 1;
  /**
   * <pre>
   *`BAD_REQUEST` indicates there is something wrong with the request.
   * </pre>
   *
   * <code>CODE_BAD_REQUEST = 2;</code>
   */
  public static final int CODE_BAD_REQUEST_VALUE = 2;
  /**
   * <pre>
   *`INTERNAL_ERROR` indicates that Raccoon encountered an unexpected condition that prevented it from fulfilling the request.
   * </pre>
   *
   * <code>CODE_INTERNAL_ERROR = 3;</code>
   */
  public static final int CODE_INTERNAL_ERROR_VALUE = 3;
  /**
   * <pre>
   *`MAX_CONNECTION_LIMIT_REACHED` indicates that Raccoon is unable to accepts new connection due to max connection is reached.
   *To prevent Raccoon from eating up resources, connection limit needs to be set. The limit is configurable on Raccoon by setting `SERVER_WEBSOCKET_MAX_CONN`
   * </pre>
   *
   * <code>CODE_MAX_CONNECTION_LIMIT_REACHED = 4;</code>
   */
  public static final int CODE_MAX_CONNECTION_LIMIT_REACHED_VALUE = 4;
  /**
   * <pre>
   *`MAX_USER_LIMIT_REACHED` indicates that existing connection with the same ID.
   *Raccoon ensures unique connection using unique identifier passed from the header
   *the first time Websocket connection is established. The header key that
   *contains unique identifier is configurable on Raccoon by setting `SERVER_WEBSOCKET_CONN_UNIQ_ID_HEADER`
   * </pre>
   *
   * <code>CODE_MAX_USER_LIMIT_REACHED = 5;</code>
   */
  public static final int CODE_MAX_USER_LIMIT_REACHED_VALUE = 5;


  @Override
  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The number of the enum to look for.
   * @return The enum associated with the given number.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static Code valueOf(int value) {
    return forNumber(value);
  }

  public static Code forNumber(int value) {
    switch (value) {
      case 0: return CODE_UNSPECIFIED;
      case 1: return CODE_OK;
      case 2: return CODE_BAD_REQUEST;
      case 3: return CODE_INTERNAL_ERROR;
      case 4: return CODE_MAX_CONNECTION_LIMIT_REACHED;
      case 5: return CODE_MAX_USER_LIMIT_REACHED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Code>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Code> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Code>() {
          @Override
          public Code findValueByNumber(int number) {
            return Code.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return CodeVerifier.INSTANCE;
  }

  private static final class CodeVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new CodeVerifier();
          @Override
          public boolean isInRange(int number) {
            return Code.forNumber(number) != null;
          }
        };

  private final int value;

  private Code(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:raystack.raccoon.v1beta1.Code)
}

