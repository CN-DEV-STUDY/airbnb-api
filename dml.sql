create table picture(
                        picture_id INTEGER NOT NULL auto_increment,
                        home_id INTEGER,
                        category_id INTEGER,
                        url VARCHAR(300) NOT NULL,
                        PRIMARY KEY(picture_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table user_host(
                          user_host_id INTEGER NOT NULL auto_increment,
                          user_id INTEGER NOT NULL,
                          host_id INTEGER NOT NULL,
                          PRIMARY KEY(user_host_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table home_notice(
                            home_notice_id INTEGER NOT NULL auto_increment,
                            home_id INTEGER NOT NULL,
                            home_notice_sort VARCHAR(100) NOT NULL,
                            home_notice_content VARCHAR(300) NOT NULL,
                            PRIMARY KEY(home_notice_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table convenient_facility(
                                    convenient_facility_id INTEGER NOT NULL auto_increment,
                                    home_id INTEGER NOT NULL,
                                    facility VARCHAR(200) NOT NULL,
                                    PRIMARY KEY(convenient_facility_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table review(
                       review_id INTEGER NOT NULL auto_increment,
                       home_id INTEGER NOT NULL,
                       user_name VARCHAR(200) NOT NULL,
                       review_date DATE NOT NULL,
                       review_content VARCHAR(10000) NOT NULL,
                       PRIMARY KEY(review_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table attractions_distance(
                                     attractions_distance_id INTEGER NOT NULL auto_increment,
                                     home_id INTEGER NOT NULL,
                                     attractions_name VARCHAR(200) NOT NULL,
                                     attractions_distance VARCHAR(200) NOT NULL,
                                     PRIMARY KEY(attractions_distance_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table use_rule(
                         use_rule_id INTEGER NOT NULL auto_increment,
                         home_id INTEGER NOT NULL,
                         use_rule VARCHAR(200) NOT NULL,
                         PRIMARY KEY(use_rule_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table safety_rule(
                            safety_rule_id INTEGER NOT NULL auto_increment,
                            home_id INTEGER NOT NULL,
                            safety_rule VARCHAR(200) NOT NULL,
                            PRIMARY KEY(safety_rule_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table bed(
                    bed_id INTEGER NOT NULL auto_increment,
                    home_id INTEGER NOT NULL,
                    bed_room_name VARCHAR(200) NOT NULL,
                    bed_room_option VARCHAR(200) NOT NULL,
                    PRIMARY KEY(bed_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table host(
                     host_id INTEGER NOT NULL auto_increment,
                     home_id INTEGER NOT NULL,
                     host_name varchar(100) NOT NULL,
                     host_sign_in_date varchar(100) NOT NULL,
                     check_superhost int(3) DEFAULT 0,
                     check_certification int(3) DEFAULT 0,
                     host_review_num int(3) DEFAULT 0,
                     host_status_message VARCHAR(500),
                     Interaction_with_guests VARCHAR(500),
                     host_language VARCHAR(200),
                     response_rate VARCHAR(200),
                     response_time VARCHAR(200),
                     PRIMARY KEY(host_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

create table home(
                     home_id INTEGER not null unique auto_increment,
                     place varchar(50) not null, #?????????
                             title varchar(500) not null, #?????????
                             is_super_host boolean not null, #????????????????????????
                             addr varchar(500) not null, #???
                             lat varchar(30) not null, #???
                             lng varchar(30) not null, #???
                             sub_title varchar(500) not null, #?????????????????? ????????????
                         filter_max_person int not null, #????????????
                             filter_bedroom int not null, #??????
                             filter_bed int not null, #??????
                             filter_bathroom int not null, #??????
                             price INTEGER not null, #??????
                             host_notice text not null, #????????????
                             loc_info varchar(5000), #???????????? ?????? ?????????
                         primary key (home_id)
) engine=InnoDB character set = utf8;

create table user(
                     user_id INTEGER NOT NULL auto_increment,
                     email varchar(100) NOT NULL,
                     pwd varchar(100) NOT NULL,
                     last_name varchar(200) NOT NULL,
                     first_name varchar(200) NOT NULL,
                     birthday date NOT NULL,
                     profileImg varchar(100) default null,
                     phone varchar(100) default null,
                     signupDate DATE NOT NULL,
                     description TEXT(10000) default null,
                     primary key (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table category (
                          category_id INTEGER NOT NULL auto_increment,
                          category_name VARCHAR(30) NOT NULL,
                          primary key (category_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
