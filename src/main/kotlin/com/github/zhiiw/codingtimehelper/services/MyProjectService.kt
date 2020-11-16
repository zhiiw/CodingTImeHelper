package com.github.zhiiw.codingtimehelper.services

import com.intellij.openapi.project.Project
import com.github.zhiiw.codingtimehelper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
