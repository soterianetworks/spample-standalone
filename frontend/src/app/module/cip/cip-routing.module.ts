import {NgModule} from '@angular/core';
import {RouterModule} from '@angular/router';

import {CipDetailComponent} from './detail/detail.component';

export const cipRoutes: any = [
    {
        path: 'cip',
        component: CipDetailComponent,
        data: {breadcrumbs: [{value: 'CIP', i18n: 'cip'}]},
    },
];

@NgModule({
    imports: [
        RouterModule.forChild(cipRoutes),
    ],
    exports: [
        RouterModule,
    ],
})
export class CipRoutingModule {
}
