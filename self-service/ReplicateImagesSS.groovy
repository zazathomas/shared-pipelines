@Library('shared-pipelines') _

properties([
    parameters([
        string(name: 'SOURCE_REGISTRY', defaultValue: 'docker.io', description: 'Source registry'),
        string(name: 'SOURCE_IMAGE', defaultValue: '', description: 'Image to replicate'),
        string(name: 'SOURCE_TAG', defaultValue: '', description: 'Select the image tag'),
        string(name: 'DESTINATION_TAG', defaultValue: '', description: 'Tag to replicate'),
    ])
])

ReplicateImages()