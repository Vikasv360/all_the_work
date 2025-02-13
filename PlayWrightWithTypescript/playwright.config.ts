import { defineConfig, devices } from '@playwright/test';


export default defineConfig({
  testDir: './tests',
  
  reporter: 'html',
 
  use: {

    headless:true,
    screenshot:'only-on-failure',
    trace: 'on-first-retry',
    browserName: 'chromium'
  }

  
});
