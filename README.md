# playmusic

Passos - Kafka

Docker commands:

- Na pasta do docker, rodas os comandos:
docker-compose -f docker-kafka.yml up

instale o programa para facilitar ua usabilidade do kafka
https://www.conduktor.io/download

Criar o tópico replytopic2 e requesttopic2

Passos - Cassandra

Docker commands:

- Na pasta do docker, rodas os comandos:

docker-compose -f docker-cassandra.yml up

Após subir o Cassandra, rodar o comando:

docker exec -it 9f6c7c8e3606 /bin/bash

Após entrar no container, rodar o comando:

cqlsh -u cassandra -p cassandra

CREATE KEYSPACE IF NOT EXISTS customer_keyspace WITH REPLICATION = {'class': 'NetworkTopologyStrategy','datacenter1':3};

use customer_keyspace;
CREATE TABLE Customer (id UUID PRIMARY KEY, name text, country text, musicStyle text);
