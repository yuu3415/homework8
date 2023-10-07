DROP TABLE IF EXISTS songs;

CREATE TABLE songs (
  id int unsigned AUTO_INCREMENT,
  music VARCHAR(50) NOT NULL,
  singer VARCHAR(50) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO songs (music, singer) VALUES ("The Beginning", "OneOKRock");
INSERT INTO songs (music, singer) VALUES ("ドライフラワー", "優里");
INSERT INTO songs (music, singer) VALUES ("Lemon", "米津玄師");
