DROP TABLE IF EXISTS movies;

CREATE TABLE movies (
  id int unsigned AUTO_INCREMENT,
  music VARCHAR(50) NOT NULL,
  singer VARCHAR(50) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO movies (name, director) VALUES ("The Beginning", "OneOKRock");
INSERT INTO movies (name, director) VALUES ("ドライフラワー", "優里");
