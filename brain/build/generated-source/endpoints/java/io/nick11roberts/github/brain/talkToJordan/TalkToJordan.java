/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-03-26 20:30:19 UTC)
 * on 2015-06-30 at 20:19:16 UTC 
 * Modify at your own risk.
 */

package io.nick11roberts.github.brain.talkToJordan;

/**
 * Service definition for TalkToJordan (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link TalkToJordanRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class TalkToJordan extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.20.0 of the talkToJordan library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://myApplicationId.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "talkToJordan/v1/prompt/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public TalkToJordan(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  TalkToJordan(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "prompt".
   *
   * This request holds the parameters needed by the talkToJordan server.  After setting any optional
   * parameters, call the {@link Prompt#execute()} method to invoke the remote operation.
   *
   * @param inputStatement
   * @return the request
   */
  public Prompt prompt(java.lang.String inputStatement) throws java.io.IOException {
    Prompt result = new Prompt(inputStatement);
    initialize(result);
    return result;
  }

  public class Prompt extends TalkToJordanRequest<io.nick11roberts.github.brain.talkToJordan.model.ResponseStatement> {

    private static final String REST_PATH = "{inputStatement}";

    /**
     * Create a request for the method "prompt".
     *
     * This request holds the parameters needed by the the talkToJordan server.  After setting any
     * optional parameters, call the {@link Prompt#execute()} method to invoke the remote operation.
     * <p> {@link
     * Prompt#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param inputStatement
     * @since 1.13
     */
    protected Prompt(java.lang.String inputStatement) {
      super(TalkToJordan.this, "POST", REST_PATH, null, io.nick11roberts.github.brain.talkToJordan.model.ResponseStatement.class);
      this.inputStatement = com.google.api.client.util.Preconditions.checkNotNull(inputStatement, "Required parameter inputStatement must be specified.");
    }

    @Override
    public Prompt setAlt(java.lang.String alt) {
      return (Prompt) super.setAlt(alt);
    }

    @Override
    public Prompt setFields(java.lang.String fields) {
      return (Prompt) super.setFields(fields);
    }

    @Override
    public Prompt setKey(java.lang.String key) {
      return (Prompt) super.setKey(key);
    }

    @Override
    public Prompt setOauthToken(java.lang.String oauthToken) {
      return (Prompt) super.setOauthToken(oauthToken);
    }

    @Override
    public Prompt setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Prompt) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Prompt setQuotaUser(java.lang.String quotaUser) {
      return (Prompt) super.setQuotaUser(quotaUser);
    }

    @Override
    public Prompt setUserIp(java.lang.String userIp) {
      return (Prompt) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String inputStatement;

    /**

     */
    public java.lang.String getInputStatement() {
      return inputStatement;
    }

    public Prompt setInputStatement(java.lang.String inputStatement) {
      this.inputStatement = inputStatement;
      return this;
    }

    @Override
    public Prompt set(String parameterName, Object value) {
      return (Prompt) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link TalkToJordan}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link TalkToJordan}. */
    @Override
    public TalkToJordan build() {
      return new TalkToJordan(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link TalkToJordanRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setTalkToJordanRequestInitializer(
        TalkToJordanRequestInitializer talktojordanRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(talktojordanRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
