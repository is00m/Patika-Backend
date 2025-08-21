--test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100) NOT NULL
);

--Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (id, name, birthday, email) values (1, 'Kati', null, 'kdesport0@163.com');
insert into employee (id, name, birthday, email) values (2, 'Shelby', '2009-05-15', 'spoynser1@fastcompany.com');
insert into employee (id, name, birthday, email) values (3, 'Zonda', null, 'zcoombs2@amazon.de');
insert into employee (id, name, birthday, email) values (4, 'Karlene', '2009-04-03', 'kivakhin3@phoca.cz');
insert into employee (id, name, birthday, email) values (5, 'Marlo', '2022-10-06', 'mfanner4@nhs.uk');
insert into employee (id, name, birthday, email) values (6, 'Hanan', '2023-06-08', 'hbrown5@gizmodo.com');
insert into employee (id, name, birthday, email) values (7, 'Bronnie', '2019-02-10', 'bfeatherstonhaugh6@cargocollective.com');
insert into employee (id, name, birthday, email) values (8, 'Nahum', '2012-03-04', 'nshoebottom7@disqus.com');
insert into employee (id, name, birthday, email) values (9, 'Vlad', '2020-11-25', 'vesome8@earthlink.net');
insert into employee (id, name, birthday, email) values (10, 'Daphne', '2015-02-14', 'dstedson9@vk.com');
insert into employee (id, name, birthday, email) values (11, 'Emmott', null, 'ekynea@dyndns.org');
insert into employee (id, name, birthday, email) values (12, 'Dyanne', '2007-12-28', 'dfigureb@gizmodo.com');
insert into employee (id, name, birthday, email) values (13, 'Manon', '2008-12-29', 'magneauc@whitehouse.gov');
insert into employee (id, name, birthday, email) values (14, 'Rollie', null, 'rturnd@google.pl');
insert into employee (id, name, birthday, email) values (15, 'Oralia', null, 'onormanvillee@berkeley.edu');
insert into employee (id, name, birthday, email) values (16, 'Tamas', '2017-02-19', 'tmcguinnessf@abc.net.au');
insert into employee (id, name, birthday, email) values (17, 'Hewet', '2013-10-25', 'hbohling@hud.gov');
insert into employee (id, name, birthday, email) values (18, 'Gale', '2009-06-08', 'galberth@foxnews.com');
insert into employee (id, name, birthday, email) values (19, 'Rubie', '2017-12-11', 'rsigsworthi@phpbb.com');
insert into employee (id, name, birthday, email) values (20, 'Keenan', '2020-06-09', 'kwoodcroftj@t.co');
insert into employee (id, name, birthday, email) values (21, 'Fidela', null, 'frapek@51.la');
insert into employee (id, name, birthday, email) values (22, 'Marcia', '2013-03-09', 'mklehynl@wikia.com');
insert into employee (id, name, birthday, email) values (23, 'Llewellyn', '2019-09-11', 'lhaddletonm@rediff.com');
insert into employee (id, name, birthday, email) values (24, 'Mella', '2025-02-08', 'malexandersenn@miitbeian.gov.cn');
insert into employee (id, name, birthday, email) values (25, 'Nicki', '2008-09-15', 'ndransfieldo@utexas.edu');
insert into employee (id, name, birthday, email) values (26, 'Beret', '2024-07-26', 'bgaskinp@sohu.com');
insert into employee (id, name, birthday, email) values (27, 'Elvina', null, 'ecribbinq@nytimes.com');
insert into employee (id, name, birthday, email) values (28, 'Carlynne', '2025-05-07', 'cquenbyr@drupal.org');
insert into employee (id, name, birthday, email) values (29, 'Auberta', '2012-07-03', 'abutterfields@drupal.org');
insert into employee (id, name, birthday, email) values (30, 'Christy', '2011-08-24', 'carnautt@woothemes.com');
insert into employee (id, name, birthday, email) values (31, 'Rivi', '2021-09-08', 'rchampu@blog.com');
insert into employee (id, name, birthday, email) values (32, 'Mercy', null, 'mhubanev@xrea.com');
insert into employee (id, name, birthday, email) values (33, 'Jobye', '2015-12-26', 'jspincksw@goo.gl');
insert into employee (id, name, birthday, email) values (34, 'Abigail', '2014-10-27', 'amorehallx@xrea.com');
insert into employee (id, name, birthday, email) values (35, 'Valerie', '2016-03-25', 'vpittfordy@smugmug.com');
insert into employee (id, name, birthday, email) values (36, 'Yolanda', null, 'yandratz@oakley.com');
insert into employee (id, name, birthday, email) values (37, 'Kathryn', null, 'krigard10@posterous.com');
insert into employee (id, name, birthday, email) values (38, 'Bram', '2008-02-18', 'babelovitz11@creativecommons.org');
insert into employee (id, name, birthday, email) values (39, 'Edwin', null, 'eenocksson12@unc.edu');
insert into employee (id, name, birthday, email) values (40, 'Veronique', '2025-01-14', 'vfacher13@wikipedia.org');
insert into employee (id, name, birthday, email) values (41, 'Robina', '2008-11-23', 'rriseley14@smh.com.au');
insert into employee (id, name, birthday, email) values (42, 'Corey', null, 'cdemorena15@icio.us');
insert into employee (id, name, birthday, email) values (43, 'Sal', '2020-03-18', 'sbecom16@cocolog-nifty.com');
insert into employee (id, name, birthday, email) values (44, 'Jessalin', null, 'jmacauley17@so-net.ne.jp');
insert into employee (id, name, birthday, email) values (45, 'Pincus', '2015-09-01', 'pitzcak18@netlog.com');
insert into employee (id, name, birthday, email) values (46, 'Raf', '2014-07-11', 'rmcdirmid19@mysql.com');
insert into employee (id, name, birthday, email) values (47, 'Jay', '2021-06-20', 'jdarque1a@foxnews.com');
insert into employee (id, name, birthday, email) values (48, 'Ruperta', '2013-07-09', 'rstienham1b@reddit.com');
insert into employee (id, name, birthday, email) values (49, 'Ludwig', '2015-10-10', 'leldrid1c@aboutads.info');
insert into employee (id, name, birthday, email) values (50, 'Amory', '2018-06-17', 'ajewes1d@wikia.com');--

--Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee
SET name = 'Patika'
WHERE id = 9;

UPDATE employee
SET birthday = '"2532-02-14"'
WHERE name = 'Keenan';

UPDATE employee
SET name = 'iso',
	email = 'iso@klc.com'
WHERE id = 3;

UPDATE employee
SET name = 'KALORIFER'
WHERE email = 'kivakhin3@phoca.cz';

UPDATE employee
SET birthday = '2025-12-31'
WHERE email = 'ekynea@dyndns.org';

--Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee
WHERE name = 'Rollie';

DELETE FROM employee
WHERE email = 'hbohling@hud.gov';

DELETE FROM employee
WHERE birthday = '2012-03-04';

DELETE FROM employee
WHERE id = 25;

DELETE FROM employee
WHERE birthday = '2025-02-08';