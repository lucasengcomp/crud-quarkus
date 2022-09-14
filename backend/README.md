# Projeto CRUD

O projeto desenvolvido objetiva a prática e entendimento do funcionamento de um CRUD 
usando alguns recursos com QUARKUS tais como:

`resteasy`
`panache`
`jsonb`
`openapi`
`swagger`


### Startando a aplicação em modo *DEV*

Para rodar|startar|compilar a aplicação em modo dev, abra o terminal na pasta _backend_ e execute o seguinte comando:
```shell script
./mvnw compile quarkus:dev
```

### Testando os endpoints

Com a aplicação rodando, abra um navegador de sua preferência(brave, chrome, IE, safari, etc) e teste os endpoints nessa URL:
```shell script
http://localhost:8080/q/swagger-ui/#/
```
<br>

Será aberto uma instância na plataforma `Swagger` e estará descrito a operação e os endpoints correspondentes
