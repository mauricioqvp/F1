INSERT INTO tb_user (first_name, last_name, email, password) 
    VALUES ('Alex', 'Brown', 'alex@gmail.com', '$2a10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, email, password) 
    VALUES ('Maria', 'Green', 'maria@gmail.com', '$2a10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_team (name, img_Url, site_Url) 
	VALUES ('MERCEDES', 'https://revistacarro.com.br/wp-content/uploads/2020/03/logo-Mercedes-Benz.jpg', 'http://www.mercedes-benz.com.br'); 
INSERT INTO tb_team (name, img_Url, site_Url) 
	VALUES ('RBR-HONDA', 'https://img.redbull.com/images/w_220/q_auto,f_auto/redbullcom/2020/12/30/b6zminwirygct6sjtwrv/red-bull-racing-logo', 'http://www.redbull.com');
INSERT INTO tb_team (name, img_Url, site_Url) 
	VALUES ('MCLAREN-MERCEDES', 'https://revistacarro.com.br/wp-content/uploads/2020/03/logo-Mercedes-Benz.jpg', 'http://www.mercedes-benz.com.br'); 
INSERT INTO tb_team (name, img_Url, site_Url) 
	VALUES ('ASTON MARTIN-MERCEDES', 'https://img.redbull.com/images/w_220/q_auto,f_auto/redbullcom/2020/12/30/b6zminwirygct6sjtwrv/red-bull-racing-logo', 'http://www.redbull.com');
INSERT INTO tb_team (name, img_Url, site_Url) 
	VALUES ('ALPINE-RENAULT', 'https://revistacarro.com.br/wp-content/uploads/2020/03/logo-Mercedes-Benz.jpg', 'http://www.mercedes-benz.com.br'); 
INSERT INTO tb_team (name, img_Url, site_Url) 
	VALUES ('FERRARI', 'https://img.redbull.com/images/w_220/q_auto,f_auto/redbullcom/2020/12/30/b6zminwirygct6sjtwrv/red-bull-racing-logo', 'http://www.redbull.com');
INSERT INTO tb_team (name, img_Url, site_Url) 
	VALUES ('ALPHATAURI-HONDA', 'https://revistacarro.com.br/wp-content/uploads/2020/03/logo-Mercedes-Benz.jpg', 'http://www.mercedes-benz.com.br'); 
INSERT INTO tb_team (name, img_Url, site_Url) 
	VALUES ('ALFA ROMEO-FERRARI', 'https://img.redbull.com/images/w_220/q_auto,f_auto/redbullcom/2020/12/30/b6zminwirygct6sjtwrv/red-bull-racing-logo', 'http://www.redbull.com');
INSERT INTO tb_team (name, img_Url, site_Url) 
	VALUES ('HAAS-FERRARI', 'https://revistacarro.com.br/wp-content/uploads/2020/03/logo-Mercedes-Benz.jpg', 'http://www.mercedes-benz.com.br'); 
INSERT INTO tb_team (name, img_Url, site_Url) 
	VALUES ('WILLIAMS-MERCEDES', 'https://img.redbull.com/images/w_220/q_auto,f_auto/redbullcom/2020/12/30/b6zminwirygct6sjtwrv/red-bull-racing-logo', 'http://www.redbull.com');



INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('Valtteri', 'Bottas', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'FINLÂNDIA'); 
INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('LEWIS', 'HAMILTON ', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'INGLATERRA'); 
INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('SERGIO', 'PÉREZ ', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'MÉXICO'); 

INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('MAX', 'VERSTAPPEN', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'HOLANDA'); 
INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('DANIEL', 'RICCIARDO ', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'AUSTRÁLIA'); 
INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('LANDO', 'NORRIS ', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'INGLATERRA'); 


INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('SEBASTIAN', 'VETTEL', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'ALEMANHA'); 
INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('LANCE', 'STROLL ', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'CANADÁ'); 
INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('ESTEBAN', 'OCON ', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'FRANÇA'); 
	

INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('FERNANDO', 'ALONSO', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'ESPANHA'); 
INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('CARLOS', 'SAINZ JR. ', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'ESPANHA'); 
INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('CHARLES', 'LECLERC ', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'MÔNACO'); 

INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('YUKI', 'TSUNODA', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'JAPÃO'); 
INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('PIERRE', 'GASLY', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'FRANÇA'); 
INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('ANTONIO', 'GIOVINAZZI ', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'ITÁLIA'); 
	
INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('MICK', 'SCHUMACHER', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'ALEMANHA'); 
INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('NIKITA', 'MAZEPIN', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'RÚSSIA'); 
INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('GEORGE', 'RUSSELL ', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'INGLATERRA'); 

INSERT INTO tb_pilot (first_Name, sur_Name, birth_Date, foto, victories, victories_In_Year, web_Site, country) 
	VALUES ('NICHOLAS', 'LATIFI ', NOW(), '', 32, 0, 'https://valtteribottas.com/', 'CANADÁ'); 
	
INSERT INTO tb_team_pilot (pilot_Id, team_Id) VALUES (1,1);