  ## Backend Release Flow
## Versioning
- For releases we use SemVer approach. (**MAJOR.MINOR.PATCH**). For example, **1.15.4**.
- For dev versions we use sequential numbering approach, handled by **Build and Deploy Server (dev)** workflow. For example, **DEV.255**
## Deployment Process
  1. **Push Release Branch**:
  - **Regular Release**:
    - After gathering all needed changes on _dev_ branch create the release branch (e.g., _release/1.16_ from _dev_).
    - Push the branch to the remote repository.
    - This will trigger the **Build Server Release** workflow.
  - **Patch Release**:
    - Create the patch feature branch with any name branched from current minor release version (e.g., _release/1.16_)
    - Create fix on this feature branch.
    - Create pull request with fix, and select target branch current minor release version branch. 
    - After pull request get's approved, merge your branch.
    - This will trigger the **Build Server Release** workflow.
  2. **Start Deployment Workflow**: 
  - Once the build is finished, start the **Deploy Server Stack (prod)** workflow, providing the version tag from the previous steps (e.g., 1.16 for a regular release or 1.15.1 for a patch release) and clicking Run Workflow.
  3. **Verify Deployment**: 
  - After the build is complete, verify that the new version of the production stack is applied by visiting **CloudFormation->Stack->{name of stack}->Parameters** and checking that the value for tags is updated.
