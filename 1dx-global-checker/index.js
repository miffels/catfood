const {initialise, check} = require("../../Tutorials-Contribution/test-tool/src/checkers/global-checker.js")

async function run() {
    await initialise();
    const res = await check(["../../Tutorials-Contribution/tutorials/btp-app-logging/btp-app-logging.md"], "../../Tutorials-Contribution");
    console.log(JSON.stringify(res, null, 2));
}

run();