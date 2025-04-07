  ## Backend Release Flow
## Versioning
- For releases we use SemVer approach. (**MAJOR.MINOR.PATCH**). For example, **1.15.4**.
- For dev versions we use sequential numbering approach, handled by **Build and Deploy Server (dev)** workflow. For example, **DEV.255**
## Deployment Process
  1. **Push Release Branch**:
  - #Regular Release#: After creating the release branch (e.g., _release/1.16_ from _dev_), push the branch to the remote repository. This will trigger the **Build Server Release** workflow.
  - #Patch Release#: After merging the feature branch into the current release branch (e.g., _release/1.15_), push the changes to the remote repository. This will also trigger the Build Server Release workflow.
  2. **Start Deployment Workflow**: 
  - Once the build is finished, start the **Deploy Server Stack (prod)** workflow, providing the version tag from the previous steps (e.g., 1.16 for a regular release or 1.15.1 for a patch release) and clicking Run Workflow.
  3. **Verify Deployment**: 
  - After the build is complete, verify that the new version of the production stack is applied by visiting **CloudFormation->Stack->{name of stack}->Parameters** and checking that the value for tags is updated.
