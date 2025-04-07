### Backend Release Flow
## Versioning
- For releases we use **SemVer** approach: **MAJOR.MINOR.PATCH** (e.g., _1.15.4_).
- For dev versions we use sequential numbering approach, handled by **Build and Deploy Server (dev)** workflow (g.e., _dev.255_).
## Deployment Process
  1. **Push Release Branch**:
  - **Regular Release**:
    - After gathering all needed changes on the _dev_ branch, create the release branch (e.g., _release/1.16_ from _dev_).
    - Push the branch to the remote repository. This will trigger the **Build Server Release** workflow.
  - **Patch Release**:
    - Create a patch feature branch with any name, branched from current minor release version (e.g., _release/1.16_)
    - Implement the necessary fix on this feature branch.
    - Create a pull request with the fix, targeting the current minor release version branch.
    - After the pull request get's approved, merge your branch. This will trigger the **Build Server Release** workflow.
  2. **Start Deployment Workflow**: 
  - Once the build is finished, start the **Deploy Server Stack (prod)** workflow.
  - Provide the version tags from the previous steps (e.g., _1.16_ for a regular release or _1.15.1_ for a patch release) and clicking **Run Workflow**.
  3. **Verify Deployment**: 
  - After the build is complete, verify that the new version of the production stack is applied by visiting **CloudFormation->Stack->{name of stack}->Parameters**
  - Check that the value for tags is updated to reflect the new version.
