CREATE TABLE IF NOT EXISTS PRICES
(
    ID        uuid PRIMARY KEY,
    BRAND_ID   varchar(255)   NOT NULL,
    START_DATE timestamp      NOT NULL,
    END_DATE   timestamp      NOT NULL,
    PRICE_LIST integer        NOT NULL,
    PRODUCT_ID varchar(255)   NOT NULL,
    PRIORITY  integer        NOT NULL,
    PRICE     decimal(19, 2) NOT NULL,
    CURRENCY  varchar(3)     NOT NULL
);