CREATE TABLE tb_habit (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    date DATE NOT NULL,
    habit_streak INT NOT NULL,
    total_checked BIGINT NOT NULL
);

CREATE TABLE tb_record (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    date DATE NOT NULL,
    checked BOOLEAN NOT NULL,
    habit_id BIGINT,
    FOREIGN KEY (habit_id) REFERENCES tb_habit(id)
);