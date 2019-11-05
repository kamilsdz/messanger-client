FROM mozilla/sbt

RUN mkdir -p /messanger
RUN mkdir -p /messanger/out

WORKDIR /messanger

COPY . /messanger
