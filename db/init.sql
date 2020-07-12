CREATE TABLE user
(
    username VARCHAR(20),
    password VARCHAR(100),
    salt VARCHAR(20)
);

INSERT INTO user (
    username, 
    password,
    salt
) VALUES (
    'user1', 
    '59b3e8d637cf97edbe2384cf59cb7453dfe30789',  -- password
    'salt'
);

INSERT INTO user (
    username, 
    password,
    salt
) VALUES (
    'user2', 
    'e3f541ead435e5b0a9454dfc7ed3bfd98cf544ae',  -- user2_password
    'edbe2384cf59c'
);