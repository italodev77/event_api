CREATE TABLE Eventos (
    BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    start_date TIMESTAMP,
    end_date TIMESTAMP,
    identifier VARCHAR(255),
    local VARCHAR(255),
    capacity INT,
    type VARCHAR(50)
);
