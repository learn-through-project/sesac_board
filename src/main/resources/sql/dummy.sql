use ms_test;

BEGIN;

INSERT INTO USERS (ID, NAME, PHONE, EMAIL, PWD, NICKNAME, CREATED_AT, UPDATED_AT)
VALUES ('test1', 'TestUser1', '010-1234-5678', 'testuser@example.com', '123', 'testNick', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO POSTS (USERID, TITLE, NICKNAME, TEXTCONTENT, CATEGORY, CREATED_AT, UPDATED_AT)
VALUES ('test1', 'Sample Title', 'should be deleted', 'This is a sample post content.', 'General', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO COMMENTS_STATUS (STATUS)
VALUES ("active");

INSERT INTO COMMENTS_STATUS (STATUS)
VALUES ("reported");

INSERT INTO COMMENTS_STATUS (STATUS)
VALUES ("blocked");

INSERT INTO COMMENTS_STATUS (STATUS)
VALUES ("deleted");

INSERT INTO COMMENTS (POST_ID, TEXT, STATUS, CREATED_AT, UPDATED_AT, USER_ID)
VALUES (1, 'This is a sample comment.', 'active', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'test1');


COMMIT;