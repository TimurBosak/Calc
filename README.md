### Backend release flow
### Major version
  1. Once all changes for the release are ready on **dev** branch, create a **release branch** from **dev** branch.
  2. The naming rule for the release branch is **release/1.x+1**, where **x** is the current major version number. For example, if the current release version is **1.15.4**, branch name should be **release/1.16**.
  3. Once the release branch is created, push it to the remote repository to initiate the release pipeline - **Build Server Release**.
  4. Once the build is finished, the last step is to start the **Delpoy server stack (prod)** workflow, providing all tags version from second step (in this case **1.16**) and clicking **Run workflow**.
  5. Once the build is finished, you can check that new version of production stack is applied by visiting **CloudFormation->Stack->{name of stack}->Parameters** and verifying that value for tags updated (**1.16** in this case).
### Minor version (generally used for hotfix delivery on production)
  1. The needed change is created on **feature branch**, based on the current major release branch (**release/1.x**).
  2. A **pull request** is created with the target branch as **release/1.x**. Once approved, the PR merged to **release/1.x**. This merge will trigger the **Build Server Release** workflow.
  3. The build will create a new release version tag with a patch increment (f.e. if the current version is **1.15**, it will become **1.15.1**)
  4. Follow step 4 from the **Major Version** flow, but use the tag created in the previous step.
  5. Follow step 5 from the **Major Version** flow to verify that the new version is applied.
