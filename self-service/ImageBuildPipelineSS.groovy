@Library('shared-pipelines') _

properties([
    parameters([
        string(name: 'GIT_REPO_URL', defaultValue: 'https://github.com/zazathomas/Jenkins-for-DevSecOps.git', description: 'Repository containing the Dockerfile'),
        string(name: 'KANIKO_CONTEXT', defaultValue: 'Docker-Deployment', description: 'Context for Docker build'),
        string(name: 'PATH_TO_DOCKERFILE', defaultValue: 'Docker-Deployment/Dockerfile', description: 'Path to Dockerfile'),
        string(name: 'IMAGE_NAME', defaultValue: '', description: 'Image name to build'),
        string(name: 'IMAGE_TAG', defaultValue: '', description: 'Specify the image tag')
    ])
])

ImageBuildPipeline()
