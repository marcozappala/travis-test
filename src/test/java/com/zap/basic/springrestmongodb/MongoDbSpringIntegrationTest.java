package com.zap.basic.springrestmongodb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

import static org.assertj.core.api.AssertionsForClassTypes.*;

@DataMongoTest
@RunWith(SpringRunner.class)
public class MongoDbSpringIntegrationTest {
    @Autowired
    MongoTemplate mongoTemplate;

    @Test
    public void test() {
        // given
//        DBObject objectToSave = BasicDBObjectBuilder.start().add("key", "value").get();
//
//        // when
//        mongoTemplate.save(objectToSave, "collection");
//
//        mongoTemplate.findAll(DBObject.class, "collection").toString();
//
//        // then
//        assertThat(mongoTemplate.findAll(DBObject.class, "collection").get(0)).extracting("key").containsOnly("value");
    }
}