// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.wealth.techupdate.web.entity;

import com.wealth.techupdate.web.entity.Topic;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect Topic_Roo_Json {
    
    public String Topic.toJson() {
        return new JSONSerializer().exclude("*.class").serialize(this);
    }
    
    public static Topic Topic.fromJsonToTopic(String json) {
        return new JSONDeserializer<Topic>().use(null, Topic.class).deserialize(json);
    }
    
    public static String Topic.toJsonArray(Collection<Topic> collection) {
        return new JSONSerializer().exclude("*.class").serialize(collection);
    }
    
    public static Collection<Topic> Topic.fromJsonArrayToTopics(String json) {
        return new JSONDeserializer<List<Topic>>().use(null, ArrayList.class).use("values", Topic.class).deserialize(json);
    }
    
}
