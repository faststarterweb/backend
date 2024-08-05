package org.faststarter.com.api.data.form;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class GenerateForm {

    @NotEmpty
    private String language;
    @NotEmpty
    private String project;
    @NotEmpty
    private String style;
    @NotEmpty
    private String springBootVersion;
    @NotNull
    private ProjectMetadata projectMetadata;
    private List<String> dependencies;
    @NotEmpty
    private String sign;

    @Data
    public static class ProjectMetadata {
        @NotEmpty
        private String group;
        @NotEmpty
        private String artifact;
        @NotEmpty
        private String name;
        private String description;
        @NotEmpty
        private String packageName;
        @NotEmpty
        private String packaging;
        @NotEmpty
        private String javaVersion;

        @AssertTrue
        public boolean checkPackaging() {
            return switch (this.packaging.toLowerCase()) {
                case "jar", "war" -> true;
                default -> false;
            };
        }

        @AssertTrue
        public boolean checkJavaVersion() {
            return switch (this.javaVersion.toLowerCase()) {
                case "11", "17", "21", "22" -> true;
                default -> false;
            };
        }
    }

    @AssertTrue
    public boolean checkLanguage() {
        return "java".equalsIgnoreCase(this.language);
    }

    @AssertTrue
    public boolean checkProject() {
        return "maven".equalsIgnoreCase(this.project);
    }

    @AssertTrue
    public boolean checkStyle() {
        return switch (this.style.toLowerCase()) {
            case "simple", "ddd" -> true;
            default -> false;
        };
    }

    @AssertTrue
    public boolean checkSpringBootVersion() {
        return switch (this.springBootVersion.toLowerCase()) {
            case "3-4-0-snapshot", "3-4-0-m1", "3-3-2", "3-2-9-snapshot", "3-2-8" -> true;
            default -> false;
        };
    }

}
