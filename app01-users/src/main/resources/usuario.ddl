CREATE TABLE IF NOT EXISTS USUARIO (
    USER_ID INTEGER NOT NULL PRIMARY KEY,
    ID INTEGER NOT NULL,
    TITLE VARCHAR(64) NOT NULL,
    COMPLETED VARCHAR(64) NOT NULL,   
);

MERGE INTO USUARIO (USER_ID, ID, TITLE, COMPLETED) VALUES (1, 1, 'delectus aut autem', 'false');