# tekton-meetup

## Setup
Tasks
```
kubectl apply -f https://raw.githubusercontent.com/tektoncd/catalog/v1beta1/git/git-clone.yaml
```
```
kubectl apply -f https://raw.githubusercontent.com/tektoncd/catalog/master/task/maven/0.2/maven.yaml
```


For debugging:
```
kubectl apply -f https://raw.githubusercontent.com/redhat-scholars/tekton-tutorial/master/workspaces/list-directory-task.yaml
```