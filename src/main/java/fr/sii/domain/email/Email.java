package fr.sii.domain.email;

import javax.validation.constraints.NotNull;
import java.util.HashMap;

/**
 * Created by tmaugin on 09/04/2015.
 */
public class Email {
    @NotNull
    public String to;
    @NotNull
    public String subject;
    @NotNull
    public String template;
    public HashMap<String, String> data;

    public Email(String to, String subject, String template, HashMap<String, String> data) {
        this.to = to;
        this.subject = subject;
        this.template = template;
        this.data = data;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public HashMap<String, String> getData() {
        return data;
    }

    public void setData(HashMap<String, String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Email{" +
                "to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", template='" + template + '\'' +
                ", data=" + data +
                '}';
    }
}
