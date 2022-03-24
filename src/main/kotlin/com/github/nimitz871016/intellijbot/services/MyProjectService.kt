package com.github.nimitz871016.intellijbot.services

import com.intellij.openapi.project.Project
import com.github.nimitz871016.intellijbot.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
