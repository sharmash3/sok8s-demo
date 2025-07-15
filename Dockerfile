FROM apache/spark:3.5.1-java17

# Download and install GCS connector
RUN curl -o /opt/spark/jars/gcs-connector-hadoop3-latest.jar \
    https://storage.googleapis.com/hadoop-lib/gcs/gcs-connector-hadoop3-latest.jar

# Copy your compiled Scala JAR into the image
COPY transaction-filter-2.0.jar /opt/spark/jars/
