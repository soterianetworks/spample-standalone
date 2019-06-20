import {NgModule} from '@angular/core';
import {RouterModule} from '@angular/router';

import {SpDetailComponent} from './detail/detail.component';

export const spRoutes: any = [
    {
        path: 'sp',
        component: SpDetailComponent,
        data: {breadcrumbs: [{value: 'SP', i18n: 'sp'}]},
    },
];

@NgModule({
    imports: [
        RouterModule.forChild(spRoutes),
    ],
    exports: [
        RouterModule,
    ],
})
export class SpRoutingModule {
}
