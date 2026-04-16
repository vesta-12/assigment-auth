# 6 Assigment

Project demonstrates a simple login feature using Java and Spring Boot.

## Contents
- Sequence Diagram for login flow
- OpenAPI documentation for:
    - /login
    - /register
    - /reset-password
- Short explanation of authentication flow

## Files
- `docs/login-sequence.puml` - PlantUML sequence diagram
- `docs/sequence-diagram.png` - exported image of diagram
- `docs/openapi.yaml` - OpenAPI documentation

## Login Flow
User sends username and password to the web server.  
Web server checks the database for user data.  
Credentials are valid, the server returns success and a token/session.  
Credentials are invalid, it returns 401 Unauthorized.