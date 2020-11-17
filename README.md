# tekton-meetup

## Setup
To actually try this out a working Kubernetes setup needs to be in place. A good way to do this locally is kind (https://kind.sigs.k8s.io/).

### Installing Tekton


### Catalog tasks
There are a few tasks we install from the Tekton catalog.

For cloning repositories:
```
kubectl apply -f https://raw.githubusercontent.com/tektoncd/catalog/v1beta1/git/git-clone.yaml
```
For executing maven tasks:
```
kubectl apply -f https://raw.githubusercontent.com/tektoncd/catalog/master/task/maven/0.2/maven.yaml
```
For building and deploying docker images without docker engine:
```
kubectl apply -f https://raw.githubusercontent.com/tektoncd/catalog/master/task/kaniko/0.1/kaniko.yaml
```
For using kubectl from your pipeline:
```
kubectl apply -f tekton/tasks/deploy-using-kubectl.yaml
```

For listing folders in a workspace (for debugging purposes):
```
kubectl apply -f https://raw.githubusercontent.com/redhat-scholars/tekton-tutorial/master/workspaces/list-directory-task.yaml
```

### Kubernetes setup
There are also a few standard k8s resources we should create.

PVC:
```
kubectl apply -f kubernetes/pvc.yaml
```
Secret for connectig to dockerhub (real credentials omitted):
```
kubectl create secret docker-registry dockerhub-mark --docker-server=DOCKER_REGISTRY_SERVER --docker-username=DOCKER_USER
--docker-password=DOCKER_PASSWORD --docker-email=DOCKER_EMAIL
```
Service account (using the previous created secret):
```
kubectl apply -f kubernetes/serviceaccount.yaml
```
### Creating the pipeline
```
kubectl apply -f tekton/pipeline.yaml
```
### Running the pipeline
```
kubectl create -f tekton/pipeline-run.yaml
```

### Test if the service is there
```
kubectl port-forward ...
```