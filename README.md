## Backend Release Flow
## Versioning
- For releases we use SemVer approach. (**MAJOR.MINOR.PATCH**). For example, **1.15.4**.
- For dev versions we use sequential numbering approach, handled by **Build and Deploy Server (dev)** workflow.
## Deployment Process
  1. Push Release Branch: After creating the release branch (for regular releases) or merging the feature branch (for patch releases), push the branch to the remote repository to initiate the release pipeline — **Build Server Release**.
  2. **Start Deployment Workflow**: Once the build is finished, start the **Deploy Server Stack (prod)** workflow, providing the version tag from the previous steps and clicking Run Workflow.
  3. **Verify Deployment**: After the build is complete, verify that the new version of the production stack is applied by visiting **CloudFormation->Stack->{name of stack}->Parameters** and checking that the value for tags is updated.
## Regular Release
  1. Create Release Branch: Once all changes for the release are ready on the dev branch, create a release branch from the dev branch.
  2. Follow **Deployment Process** steps.
## Patch Release (Hotfix Delivery)
  1. **Create Feature Branch**: The needed change is created on a **feature branch**, based on the current release branch (**release/1.x**).
  2. **Create Pull Request**: A pull request is created with the target branch as **release/1.x**. Once approved, the PR is merged into **release/1.x**. This merge will trigger the **Build Server Release** workflow.
  3. **Version Tag Creation**: The build will create a new release version tag with a patch increment (e.g., if the current version is **1.15**, it will become **1.15.1**).
  4. Follow **Deployment Process** steps.
