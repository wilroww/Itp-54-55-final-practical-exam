DROP USER SelfCheckoutSystem CASCADE; 

CREATE USER SelfCheckoutSystem IDENTIFIED BY Changeme0; 
ALTER USER SelfCheckoutSystem QUOTA UNLIMITED ON DATA; 
ALTER USER SelfCheckoutSystem QUOTA UNLIMITED ON USERS; 

GRANT CREATE SESSION TO SelfCheckoutSystem WITH ADMIN OPTION; 
GRANT CONNECT TO SelfCheckoutSystem; 
ALTER SESSION SET CURRENT_SCHEMA = SelfCheckoutSystem; 

DROP TABLE Customer cascade constraints;
DROP TABLE Item cascade constraints;
DROP TABLE Transact cascade constraints;
DROP TABLE TransactDetails cascade constraints;

CREATE TABLE Customer (
    customerId VARCHAR(2) PRIMARY KEY,
    customer VARCHAR(12),
    address VARCHAR(10),
    contactNumber VARCHAR(11)
);

CREATE TABLE Item (
    itemId VARCHAR(10) PRIMARY KEY,
    itemDesc VARCHAR(15),
    unitPrice DECIMAL(10, 2)
);

CREATE TABLE Transact (
    customerId VARCHAR(2),
    transactDate VARCHAR(10),
    transactNumber VARCHAR(4)
);

CREATE TABLE TransactDetails (
    itemId VARCHAR(10),
    transactDetailsId VARCHAR(2) PRIMARY KEY,
    transactNumber VARCHAR(4),
    qty INT,
    unitPrice DECIMAL(10, 2)
);

ALTER TABLE Transact
ADD CONSTRAINT fk_customerId FOREIGN KEY (customerId) REFERENCES Customer(customerId);

ALTER TABLE TransactDetails
ADD CONSTRAINT fk_itemId FOREIGN KEY (itemId) REFERENCES Item(itemId);

INSERT INTO Customer (customerId, customer, address, contactNumber) VALUES ('01', 'j. dela cruz', 'tagaytay', '09191112223');
INSERT INTO Customer (customerId, customer, address, contactNumber) VALUES ('02', 'a. kechum', 'silang', '09991119219');
INSERT INTO Customer (customerId, customer, address, contactNumber) VALUES ('03', 'g. viscon', 'alfonso', NULL);

INSERT INTO Item (itemId, itemDesc, unitPrice) VALUES ('01', 'coocoo cola', '50.00');
INSERT INTO Item (itemId, itemDesc, unitPrice) VALUES ('02', 'gardenya', '25.00');
INSERT INTO Item (itemId, itemDesc, unitPrice) VALUES ('03', 'stick u', '60.00');

INSERT INTO Transact (customerId, transactDate, transactNumber) VALUES ('01', '04-11-2024', '1');
INSERT INTO Transact (customerId, transactDate, transactNumber) VALUES ('02', '04-11-2024', '2');
INSERT INTO Transact (customerId, transactDate, transactNumber) VALUES ('03', '04-12-2024', '3');

INSERT INTO TransactDetails (itemId, transactDetailsId, transactNumber, qty, unitPrice) VALUES ('01', '1', '1', 1, '50.00');
INSERT INTO TransactDetails (itemId, transactDetailsId, transactNumber, qty, unitPrice) VALUES ('02', '2', '1', 2, '25.00');
INSERT INTO TransactDetails (itemId, transactDetailsId, transactNumber, qty, unitPrice) VALUES ('01', '3', '2', 2, '50.00');
INSERT INTO TransactDetails (itemId, transactDetailsId, transactNumber, qty, unitPrice) VALUES ('02', '4', '3', 1, '25.00');
INSERT INTO TransactDetails (itemId, transactDetailsId, transactNumber, qty, unitPrice) VALUES ('03', '5', '4', 1, '60.00');

commit;

select * from TransactDetails;