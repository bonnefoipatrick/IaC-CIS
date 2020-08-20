package com.cis.iac.entity

data class BlocApplicatif (
        val codeBloc: String,
        val name: String,
        val description : String,
        val componentApplicatif: List<ComponentApplicatif> = mutableListOf()
)

data class ComponentApplicatif (
        val codeComponentApplicatif: String,
        val name: String,
        val description: String,
        val servers: List<Server> = mutableListOf()
)

data class Server (
        val code: String,
        val description: String,
        val os: OS,
        val IPs: List<IP> = mutableListOf()
)

data class IP (
        val ip: String,
        val dmz: DMZ
)

enum class OS()
enum class DMZ()

data class Resource (
        val code: String,
        val description: String,
        val typeResource: ResourceType
)

data class ResourceType()

data class Provider (
        val code: String,
        val description: String
)

data class VPC(
        val subnet: String
)

data class FunctionalZone (
        val code: String,
        val name: String,
        val description: String,
        val areas : List<FunctionalArea> = mutableListOf()
)

data class FunctionalArea (
        val code: String,
        val name: String,
        val description: String,
        val blocks: List<FunctionalBlock> = mutableListOf()
)

data class FunctionalBlock (
        val code: String,
        val name: String,
        val description: String,
        val applications: List<ApplicationBlock> = mutableListOf()
)

data class ApplicationBlock (
        val code: String,
        val name: String,
        val description: String
)